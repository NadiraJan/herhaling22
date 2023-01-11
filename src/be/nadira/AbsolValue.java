package be.nadira;

import java.util.Scanner;

public class AbsolValue {
    public static void main(String[] args) {
        int n;
        Scanner kbd = new Scanner(System.in);
        System.out.println("enter n: ");
        n = kbd.nextInt();

        System.out.println(abs(n));
    }

    public static boolean abs(int n) {

            return ((Math.abs(100-n)<=10)||(Math.abs(200-n)<=10));

        }

}