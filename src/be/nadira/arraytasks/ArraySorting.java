package be.nadira.arraytasks;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 15, 22, 35};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted number " + Arrays.toString(numbers));

        int key = 22;
        System.out.println(key + " found at index: " + Arrays.binarySearch(numbers, key));
        // result: 22 found at index: 3

         //copy maken van array:
        int[] biggerArray = Arrays.copyOf(numbers, 25);
        System.out.println(Arrays.toString(biggerArray));
        //result: [10, 15, 20, 22, 35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0] nullen voor 25 elementen

        //default values maken:
        int[] testScores = new int[25];
        Arrays.fill(testScores, 10);
        System.out.println("All test scores: " + Arrays.toString(testScores));
        //result:All test scores: [10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10]
    }
}
