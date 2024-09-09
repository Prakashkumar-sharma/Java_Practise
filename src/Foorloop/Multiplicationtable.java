package Foorloop;

public class Multiplicationtable {
    public static void main(String[] args) {
        int x = 15;
        int multiplication = 1;
        for(int i = 1 ; i <= 10 ; i++){
            multiplication = x * i;
            System.out.println(x + " * " + i + " = " + multiplication);
        }
    }
}
