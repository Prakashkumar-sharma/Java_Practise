package Nestedloop;

public class Starpatternex5 {
    public static void main(String[] args) {
        for(int row = 1 ; row <= 5 ; row++ ) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
        for(int row = 1 ; row <= 5 ; row++ ) {
            for (int column = 1; column <=5-row; column++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }
}
