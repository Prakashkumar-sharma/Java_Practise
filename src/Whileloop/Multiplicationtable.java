package Whileloop;

public class Multiplicationtable {
    public static void main(String[] args) {
        int x = 5;
        int y = 1;
        while (y<=10){
            int z = x * y;
            System.out.println(x + " * " +  y  + " = " + z);
            y++;
        }
    }
}
