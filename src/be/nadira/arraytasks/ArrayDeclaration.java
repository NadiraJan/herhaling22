package be.nadira.arraytasks;

import java.util.Arrays;

public class ArrayDeclaration {
    public static void main(String[] args) {
// first
        int[] array = new int[5];
        array[0] = 14;
        array[1] = 4;
        array[2] = 1;
//second
        int[] array1 = {14,4,1};
        System.out.println(Arrays.toString(array1));

        System.out.println(Arrays.toString(array));

        for(int i=0; i< array.length; i++){
            if(array[i]>50){
                array[i]=50;
            }
            System.out.println(array[i]);
        }

        //third
        int[]array2;
        array2 = new int[] {5,2,1,5};


    }
}
