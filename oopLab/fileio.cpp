// #include <iostream>
// #include <fstream>
// #include <string>
// using namespace std;

// int main() {
// 	fstream file1("myFile.txt");
// 	file1 << "Files can be tricky enough, but it is fun enough!\n";
// 	file1.close();

// 	fstream fileRead("myFile.txt");
// 	string s;
// 	while (getline(fileRead, s)) {
// 		cout << s << endl;
// 	}
// 	fileRead.close();
// 	return 0;
// }

#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main() {
    ofstream MyWriteFile("friends.txt");
    cout << "How many friends do you have?" << endl;
    int n, age;
    cin >> n;
    cin.ignore(); // Consume the newline character left in the buffer

    if (n == 0)
        MyWriteFile << "Ha Ha! You have no Friends." << endl;

    for (int i = 0; i < n; i++) {
        string inputLine;
        cout << "Enter name and age (separated by a space): ";
        getline(cin, inputLine);

        // Find the position of the space character
        size_t spacePos = inputLine.find(' ');

        // Extract name and age from the input line
        string name = inputLine.substr(0, spacePos);
        age = stoi(inputLine.substr(spacePos + 1)); // Convert substring to integer

        MyWriteFile << name << endl;
        MyWriteFile << age << endl;
    }
    MyWriteFile.close();

    ifstream myReadFile("friends.txt");
    string inputLine;
    while (getline(myReadFile, inputLine)) {
        cout << inputLine << endl;
    }
    myReadFile.close();

    return 0;
}

