package be.nadira;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String str2 = "learn programming";
        char symbols[] =  str2.toCharArray();
        for(int x=symbols.length-1;x>=0;x--){
            System.out.print(symbols[x]);
        }
        System.out.println();

        String str3 = "learn programming";
        Scanner kbd = new Scanner(System.in);
        System.out.println("enter your string");
        str3 = kbd.nextLine();
        String[]temp = str3.split("");
        for(int i=temp.length-1; i>=0; i--){
            System.out.print(temp[i] + "");
        }
    }


}
