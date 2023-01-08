package be.nadira;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int temp, number;
        boolean numberIsPrime = true;
        Scanner kbd = new Scanner(System.in);
        System.out.println("enter your number: ");
        number = kbd.nextInt();
        kbd.close();
        for(int x = 2; x<=number/2; x++) {

            temp = number %x;
            if(temp ==0){
                numberIsPrime = false;
                break;
            }
        }
        if(numberIsPrime)
            System.out.println(" number is prime");
        else
            System.out.println(" number is not prime");
    }
}
