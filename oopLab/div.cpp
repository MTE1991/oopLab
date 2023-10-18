#include <iostream>
using namespace std;

int main() {
    float n1, n2;
    try {
        cout << "Enter two nums: ";
        cin >> n1 >> n2;
        if (n2 != 0) {
            cout << n1 << "/" << n2 << " = " << n1 / n2 << endl;
        } else {
            throw (-1);
        }
    }
    catch (int e) {
        cout << "Division by zero error! Error code = " << e << endl;
    }
    return 0;
}