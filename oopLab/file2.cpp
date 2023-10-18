#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main() {
	int n;
	string name;
	int age;
	cout << "Enter the no of your friends: ";
	cin >> n;

	ofstream file1("friends.txt");
	for (int i = 0; i < n; i++) {
		cout << "Enter name and age for friend " << i + 1 << ": ";
		cin >> name >> age;
		file1 << name << " " << age << "\n";
	}
	file1.close();
	
	ifstream fileRead("friends.txt");
	string s;
	while (getline(fileRead, s)) {
		cout << s << endl;
	}

	fileRead.close();
	return 0;
}