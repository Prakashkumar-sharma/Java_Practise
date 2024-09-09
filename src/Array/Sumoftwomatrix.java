package Array;

public class Sumoftwomatrix {
    public static void main(String[] args) {
        int[][] array1 = {{2, 3, 4}, {5, 6, 7}};
        int[][] array2 = {{10, 12, 15}, {18, 24, 25}};
        int[][] result = {{0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }
        for (int i = 0; i < array1.length; i++) { // row number of times
            for (int j = 0; j < array1[i].length; j++) { // column number of time
                result[i][j] = array1[i][j] + array2[i][j];
                System.out.print(result[i][j] + " ");
            }
        }
    }
}
