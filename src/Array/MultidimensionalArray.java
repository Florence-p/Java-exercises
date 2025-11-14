package Array;

public class MultidimensionalArray {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 4, 5},
                {2, 6, 8, 10},
                {9, 3, 9, 7}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) { // columns
                System.out.print(array[i][j] + " ");
            }
            System.out.println();                       // new line after each row
        }
    }
}
