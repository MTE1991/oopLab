#include <iostream>
using namespace std;

class Employee {
private:
	int salary;

public:
	void setSalary(int salary) {
		this->salary = salary;
	}

	int getSalary() {
		return salary;
	}
};

int main() {
	Employee emp1;
	emp1.setSalary(50000);
	cout << emp1.getSalary() << endl;
	return 0;
}