package Foorloop;

public class Power {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int power = 1;
        for(int i = 1 ; i <= y ; i++){
            power = x * power ;
        }
        System.out.println(power);
    }
}
