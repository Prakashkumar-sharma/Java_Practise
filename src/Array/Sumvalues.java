package Array;

public class Sumvalues {
    public static void main(String[] args) {
        int[] arraylist = new int[5];
        arraylist[0] = 20;
        arraylist[1] = 10;
        arraylist[2] = 40;
        arraylist[3] = 30;
        arraylist[4] = 50;
        int sum = 0;

        for (int i = 0; i < arraylist.length; i++) {
            sum = sum + arraylist[i];
        }
        System.out.println("Sum : " + sum);


    }
}
