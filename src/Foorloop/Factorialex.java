package Foorloop;

public class Factorialex {
    public static void main(String[] args) {
        int x = 11;
        int factorial = 1;
        for(int i = 1; i<= x; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
