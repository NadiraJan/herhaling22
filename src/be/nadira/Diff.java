package be.nadira;

import java.util.Scanner;

public class Diff {
    public static void main(String[] args) {
        int n;
        Scanner kbd = new Scanner(System.in);
        System.out.println("enter n: ");
        n = kbd.nextInt();

        System.out.println(diff(n));




    }
    public static int diff(int n){
        if(n<=21){
            return  21-n;
        } else {
            return(n-21)*2;
        }
    }
}
