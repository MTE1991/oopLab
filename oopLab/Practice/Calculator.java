package Practice;

public class Calculator {
    private double op1, op2;
    private char op;

    public Calculator(double op1, double op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    public double evaluate(char op) {
        this.op = op;
        switch (this.op) {
            case '+':
                return this.op1 + this.op2;
            case '-':
                return this.op1 - this.op2;
            case '*':
                return this.op1 * this.op2;
            case '/':
                if ((int)this.op2 == 0) {
                    System.out.println("Divide by zero error!");
                    return Double.MAX_VALUE;
                } else {
                    return this.op1 / this.op2;
                }
            case '%':
                if ((int)this.op2 == 0) {
                    System.out.println("Divide by zero error!");
                    return Double.MAX_VALUE;
                } else {
                    return (double) (int)this.op1 % (int)this.op2;
                }
            default:
                System.out.println("Invalid operation!");
                return Double.MIN_VALUE;
        }
    }
}
