package be.nadira;

import java.util.Scanner;

public class AverageValue {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        String msg = "enter number";
        String result = "the number is: ";

        System.out.println(msg);
        double number1 = kbd.nextDouble();
        System.out.println(result + number1);

        System.out.println(msg);
        double number2 = kbd.nextDouble();
        System.out.println(result + number2);

        System.out.println(msg);
        double number3 = kbd.nextDouble();
        System.out.println(result + number3);

        double average = average(number1, number2, number3);
        System.out.println("average is: " + average);
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
