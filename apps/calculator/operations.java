public class operations {
    int num1;
    int num2;
    String operator;


    public operations(int num1, int num2, String Operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = Operator;
    }

    int Add() {
        int add = this.num1 + this.num2;
        return add;
    }

    int Minus() {
        int minus = this.num1 - this.num2;
        return minus;
    }

    int Multiply() {
        int multiply = this.num1 * this.num2;
        return multiply;
    }

    int Divide() {
        int divide = this.num1 / this.num2;
        return divide;
    }    

}
