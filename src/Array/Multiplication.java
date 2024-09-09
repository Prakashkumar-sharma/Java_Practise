package Array;

public class Multiplication {
    public static void main(String[] args) {
        int[] array1 = {5,10,15,20,25};
        int[] array2 = {25,20,15,10,5};
        int[] multiplication = {1,1,1,1,1};
        for(int i = 0 ; i < array1.length ; i++){
            for(int j = 0 ; j < array2.length ; j++){
                 System.out.println(array1[i] * array2[j]);
                 break;


            }
        }
           System.out.println();
    }
}
