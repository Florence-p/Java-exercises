package Array;

import java.util.Random;

public class ArrayWithRandom {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] array = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) { // columns
                array[i][j] = random.nextInt(92);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();                       // new line after each row
        }
    }
}
