import java.util.Arrays;

public class multiply {
    public static void main(String[] args) {
        // arr1
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // arr2
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // 2D array result
        int[][] result = new int[arr1.length][arr2.length];

        // loop through arr1
        for (int i = 0; i < arr1.length; i++) {
            // loop through arr2
            for (int j = 0; j < arr2.length; j++) {
                //result[i][j] equals element at arr1[i] index * element at arr2[j] index
                result[i][j] = arr1[i] * arr2[j];
                // print out result add \t to tab over
                System.out.print(result[i][j] + "\t");
            }
            // after each row print new line
            System.out.println();
        }

    }
}
