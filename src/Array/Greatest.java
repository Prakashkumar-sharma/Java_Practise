package Array;

public class Greatest {
    public static void main(String[] args) {
        int[] number = {10, 20, 80, 40, 50};
        int max = 0;
        for(int e: number){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: " + max);

    }
}
