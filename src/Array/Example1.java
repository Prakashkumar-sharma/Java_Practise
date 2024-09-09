package Array;

public class Example1 {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30, 40, 50};
        for (int index = 0; index < intArray.length; index++) {
            System.out.println(intArray[index]);
        }
        System.out.println();


       for (int element : intArray) {
            System.out.println(element);

        }
    }

}