package Array;

public class Example6 {
    public static void main(String[] args) {
        int[][] ints = {{1,2,3},{2,3,4}, {3,4,5}};


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
