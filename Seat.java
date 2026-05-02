package Coding1;

import java.util.Scanner;

public class Seat {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Total number of students: ");
    int totalS = in.nextInt();

    String[] Sdept = new String[totalS];

    System.out.println("Enter department of students: ");
    for (int i = 0; i < Sdept.length; i++) {
      Sdept[i] = in.next();
    }

    // Apply seating adjustment
    seatChange(Sdept);

    // Print final arrangement
    System.out.println("Final Seating:");
    for (String s : Sdept) {
      System.out.print(s + " ");
    }
  }

  static void seatChange(String[] arr) {
    for (int i = 0; i < arr.length - 2; i++) {
      if (arr[i].equals(arr[i + 1])) {
        // Try swapping with next available different student
        for (int j = i + 2; j < arr.length; j++) {
          if (!arr[j].equals(arr[i])) {
            swap(arr, i + 1, j);
            break;
          }
        }
      }
    }
  }

  public static void swap(String[] arr, int i, int j) {
    String temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
