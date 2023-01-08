package be.nadira;

public class CalcApp {
    public static void main(String[] args) {

        double num1=5.0;
        double num2=5.0;

        double result = Calculator.addition(num1, num2);
        Calculator.printResult(result);

        result = Calculator.division(num1, num2);
        Calculator.printResult(result);
    }
}
