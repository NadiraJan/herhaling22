package be.nadira;

import java.util.Scanner;

public class Parrot {


    public static void main(String[] args) {


        int a;
        Scanner kbd = new Scanner(System.in);
        System.out.println("enter a");
        a = kbd.nextInt();

        int b;
        System.out.println("enter b");
        b = kbd.nextInt();

        System.out.println(sum(a,b));



    }
    public static boolean sum(int a, int b) {
        if (a == 10 ||b==10 || a+b==10 ) {
            return true;
        } else {
            return false;
        }
    }
}
