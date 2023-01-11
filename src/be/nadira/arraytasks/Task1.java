package be.nadira.arraytasks;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[]array = new int[20];  // of for(int i=0; i<array.length;i++){ array[i]=(i+1)*7; ipv i+1 mogen j gebruiken
        for(int i=0,  j=1; i< array.length; i++){
            array[i] = j++ * 7;
        }
        System.out.println(Arrays.toString(array));//result: [7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98, 105, 112, 119, 126, 133, 140]
    }
}
