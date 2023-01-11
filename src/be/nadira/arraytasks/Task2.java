package be.nadira.arraytasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("enter a line of text: ");
        String text = kbd.nextLine();

        String[]diffWords = text.split(" ");
        for(String word: diffWords){
            System.out.println(word);
        }
    }
}
