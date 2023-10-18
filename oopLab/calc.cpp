#include <iostream>
using namespace std;

class Calculator {
private:
    float num1, num2;
    char op;

public:
    Calculator(char op);
    void set_nums(float a, float b);
    float get_result();
};

Calculator::Calculator(char op) {
    this->op = op;
}

void Calculator::set_nums(float a, float b) {
    num1 = a;
    num2 = b; 
}

float Calculator::get_result() {
    switch (op) {
        case '+':
            return num1 + num2;
        case '-':
            return num1 - num2;
        case '*':
            return num1 * num2;
        case '/':
            if (num2 != 0) {  // Check for division by zero
                return num1 / num2;
            } else {
                cout << "Divide by Zero error!\n";
                return -1;
            }
        case '%':
            if (num2 != 0) {  // Check for modulo by zero
                return int(num1) % int(num2);
            } else {
                cout << num1 << " MOD zero is undefined!\n";
                return -1;
            }
        default:
            cout << "Invalid Operator!\n";
            return -1;
    }
}

int main() {
    float n1, n2;
    char op;
    cout << "Enter two numbers: ";
    cin >> n1 >> n2;
    cout << "Choose an operation (+, -, * or %%): ";
    cin >> op;
    Calculator myCalc(op);
    myCalc.set_nums(n1, n2);
    cout << "The result is = " << myCalc.get_result() << endl;
    return 0;
}
