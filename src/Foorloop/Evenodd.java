package Foorloop;

public class Evenodd {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 100 ; i++){
            if(i % 2 == 0 ){
                System.out.println( i + " is " + "Even number");
            }
            else {
                System.out.println(i  + " is " +  "Odd number");
            }
        }
    }
}
