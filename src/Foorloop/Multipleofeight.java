package Foorloop;

public class Multipleofeight {
    public static void main(String[] args) {
        int x = 8 ;
        int sum = 0;
        int table;
        for(int i = 1 ; i <= 10 ; i++){
            table = x * i;
            sum = sum + table;
        }
        System.out.println(sum);
    }
}
