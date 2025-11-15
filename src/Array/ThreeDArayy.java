package Array;

public class ThreeDArayy {

        public static void main(String[] args) {
            int nums[][][] = new int[3][3][3];

            for (int i = 0; i < nums.length; i++) {

                for (int j = 0; j < nums[i].length; j++) {

                    for (int k = 0; k < nums[i][j].length; k++) {
                        System.out.print(nums[i][j][k] + " "); // use print, not println
                    }

                    System.out.println(); // new line after each row
                }

                System.out.println();
            }
        }
    }

