package Whileloop;

public class Sumofodds {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        while (x<=5){
            sum = sum+2*x+1;
            x++;
        }
        System.out.println(sum);
    }
}
