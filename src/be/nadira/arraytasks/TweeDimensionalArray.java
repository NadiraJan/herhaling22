package be.nadira.arraytasks;

import java.util.Random;

public class TweeDimensionalArray {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4}, {5, 2, 7, 9, 10, 12,}, {8}};

        System.out.println("Length of row 1: " + array[0].length);
        System.out.println("Length of row 2: " + array[1].length);
        System.out.println("Length of row 3: " + array[2].length);

        for(int i= 0; i < array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.println(array[i][j] + "\t"); //  \t = tab
            }
            System.out.println();
        }

        Random random = new Random();
        final int ROW = 12;
        final int COLUMN = 6;

        int[][] lottoNumbers = new int[ROW][COLUMN];

        for (int i=0; i<lottoNumbers.length; i++){

            for(int j=0; j<lottoNumbers[i].length; j++){
                lottoNumbers[i][j] = random.nextInt(45) + 1;
            }
        }
        System.out.println("\n\nLotto numberS:\n\n");
        for(int[] rows: lottoNumbers){
            for(int element: rows){
                System.out.print(element + "\t");
            }
            System.out.println();
        }


}
}