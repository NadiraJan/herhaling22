package be.nadira;

import java.util.Scanner;

public class Palyndrom {
    public static void main(String[] args) {
        String inputString, reversedString="";
        Scanner kbd = new Scanner(System.in);
        int stringLength;
        System.out.println("enter a number or string");
        inputString = kbd.nextLine();
        stringLength = inputString.length();
        for(int x = stringLength - 1; x>=0;x--){
            reversedString = reversedString + inputString.charAt(x);
        }
        System.out.println("palyndrom: " + reversedString);

        if(inputString.equals(reversedString))
            System.out.println("value is a palyndrom");
        else
            System.out.println("value is not a palyndrom");
    }
}
