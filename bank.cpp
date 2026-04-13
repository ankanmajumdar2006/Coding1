#include <iostream>
#include <string>
using namespace std;

class Branch {
private:
  double password;
  double balance;

public:
  string name;
  string location;
  int age;
  void changeName(string newName) { name = newName; }
};

int main() {
  Branch bank[3];
  // Taking all essential details.
  for (int i = 0; i < 3; i++) {
    cout << "put details of branch member " << (i + 1) << endl;
    cin >> bank[i].name;
    cin >> bank[i].location;
    cin >> bank[i].age;
    if (bank[i].age < 18) {
      cout << "not eligible";
      break;
    }
  }
}
