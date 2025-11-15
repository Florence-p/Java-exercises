package Array;

public class Jaggedarray {
    public static void main(String[] args) {

        int nums[][] = new int[3][];
        nums[0] = new int[3]; // row 0 has 3 columns
        nums[1] = new int[4]; // row 1 has 4 columns
        nums[2] = new int[2]; // row 2 has 5 columns

        //Input numbers manually
        nums[0][0] = 10;
        nums[0][1] = 20;
        nums[0][2] = 30;

        nums[1][0] = 5;
        nums[1][1] = 15;
        nums[1][2] = 25;
        nums[1][3] = 35;

        nums[2][0] = 100;
        nums[2][1] = 200;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");

            }
            System.out.println();
        }

    }
}
