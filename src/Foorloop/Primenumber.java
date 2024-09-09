package Foorloop;

public class Primenumber {
    public static void main(String[] args) {
        int num = 8;
        int result = 0;
        for(int i = 1 ; i<=num ; i++){
            if(num%i==0){
                result = result + 1;
            }
        }
        if(result==2){
            System.out.println(num + " is prime number");
        }
        else {
            System.out.println(num + " is not prime number");
        }
    }
}
