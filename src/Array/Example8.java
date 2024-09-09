package Array;

public class Example8 {
    public static void main(String[] args) {
        int[] numbers = {200 , 400 , 300 , 100  , 500};
        String[] words = {"name" , "My" , "Sharma" , "is" , "Prakash"};


      //  System.out.println("Original numeric array : " + Arrays.toString(numbers));

        System.out.println(numbers);

        System.out.println(numbers.length);

        System.out.println(numbers[2]);

        System.out.println(numbers.length-1);

        for (int i = 0 ; i <= numbers.length ; i++){
            System.out.println(numbers[i]);
        }

    }
}
