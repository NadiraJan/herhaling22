package be.nadira;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("enter your number: ");
        int number = kbd.nextInt();

        System.out.println(isEven(number));
    }

 public static boolean isEven(int number){
        return (number % 2 ==0 );
 }

}
