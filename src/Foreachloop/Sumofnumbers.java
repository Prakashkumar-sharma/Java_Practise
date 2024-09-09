package Foreachloop;

public class Sumofnumbers {
    public static void main(String[] args) {
        int[] array = {100 , 300 , 500 , 900 , 1200};
        int sum = 0;
         for (int num : array){
             sum = sum + num;
         }
        System.out.println("Sum : " + sum);
    }
}
