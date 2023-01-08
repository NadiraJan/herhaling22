package be.nadira;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        int a, b;
        System.out.println("enter a and b");
        Scanner kbd = new Scanner(System.in);
        a = kbd.nextInt();
        b= kbd.nextInt();
        System.out.println("Before\na="+a+"\nb ="+b);

        a = a + b;
        b = a-b;


        System.out.println("after\na ="+a+"\nb = "+b);
    }
}
