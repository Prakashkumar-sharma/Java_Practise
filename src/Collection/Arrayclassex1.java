package Collection;

import java.util.Arrays;

public class Arrayclassex1 {
    public static void main(String[] args) {
        int[] numbers = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
        int index = Arrays.binarySearch(numbers , 4);

        System.out.println("Element at index 4 : " + index);


        Integer[] num = {10 , 8 , 5 , 3 , 9 , 2 , 1 , 7 , 4 , 6};
        Arrays.sort(num);

      //  Arrays.fill(numbers , 12);

        for (int i : numbers){
            System.out.println(i + " ");
        }
    }
}
