package Nestedloop;

public class Starpatternex3 {
    public static void main(String[] args) {
        for(int rows = 1 ; rows <= 10 ; rows++){
            for(int spaces = 1 ; spaces <= 10-rows ; spaces++){
                System.out.print(" " + " ");
            }
            for (int stars = 1 ; stars <=rows ; stars++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
