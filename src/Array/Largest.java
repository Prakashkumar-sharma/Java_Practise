package Array;

public class Largest {
    public static void main(String[] args) {
        int[] array = { 30,10,50,20,40,80};
        int largest = 0;
        for(int i = 0 ; i < array.length ; i++){
          if(array[i]>largest){
             largest = array[i];
          }
        }
        System.out.println(largest);
    }
}
