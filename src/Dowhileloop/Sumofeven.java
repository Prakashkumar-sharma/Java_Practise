package Dowhileloop;

public class Sumofeven {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        do {
            sum = sum + 2*x;
            x++;
        }while (x<=5);
        System.out.println(sum);
    }
}
