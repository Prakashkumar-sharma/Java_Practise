package Nestedloop;

public class Example5 {
    public static void main(String[] args) {
        int weeks = 3;
        int days = 7;


        for(int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);


            for(int j = 1; j <= days; ++j) {

                // continue inside the inner loop
                if(j % 2 != 0) {
                    continue;
                }
                System.out.println("  Days: " + j);
            }
        }
    }
}
