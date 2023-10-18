#include <iostream>
using namespace std;

int main() {
	try {
		int age = 22;
		if (age >= 18) {
			cout << "Access granted - you are old enough!\n";
		} else {
			throw age;
		}
	}
	catch (int age) {
		cout << "Access denied! - You must be at least 18 yrs old.\n";
		cout << "Your age = " << age << endl;
	}
	return 0;
}