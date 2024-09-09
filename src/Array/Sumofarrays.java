package Array;

public class Sumofarrays {
    public static void main(String[] args) {
        int[] array1 = {10,20,30,40,50};
        int[] array2 = {50,40,30,20,10};
        int[] sum    = {0,0,0,0,0};
        for(int i = 0 ; i < array1.length ; i++){
            for(int j = 0 ; j < array2.length ; j++){
                System.out.println(array1[i] + array2[i]);
                break;
            }
        }

    }
}
