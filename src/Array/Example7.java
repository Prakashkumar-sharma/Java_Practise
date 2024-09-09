package Array;

public class Example7 {
    public static void main(String[] args) {
       int[][] ints = new int[3][3];
       ints[0][0] = 1;
       ints[0][1] = 2;
       ints[0][2] = 3;
       ints[1][0] = 2;
       ints[1][1] = 3;
       ints[1][2] = 4;
       ints[2][0] = 3;
       ints[2][1] = 4;
       ints[2][2] = 5;


        for (int row = 0; row < ints.length; row++) {
            for (int col = 0; col < ints[row].length; col++) {
                System.out.print(ints[row][col]+"\t");
            }
            System.out.println();
        }


        System.out.println();
        for (int[] row : ints) {
            for (int col: row) {
                System.out.print(col+"\t");
            }
            System.out.println();
        }



    }
}
