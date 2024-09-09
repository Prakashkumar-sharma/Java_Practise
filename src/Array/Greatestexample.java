package Array;

public class Greatestexample {
    public static void main(String[] args) {
        int[] array = {20,10,40,50,30};
        for (int i = 0 ; i < array.length ; i++){
            if(array[i] > array[i+1]){
                System.out.println(array[i] + " Is greatest");
            }
            else {
                System.out.println(array[i+1] + " Is greatest");

            }
        }
    }
}
