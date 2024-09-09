package Array;

public class Example9 {
    public static void main(String[] args) {
        int[] num = { 40, 60 , 50 , 80 , 100};
        int element = 80;
        boolean B = false;
        for (int i = 0 ; i < num.length ; i++){
            if(element == num[i]){
               B = true;
             //  break;
            }
        }
        if(B){
            System.out.println(element + " is available ");
        }
        else{
            System.out.println("Element not available ");
        }
    }
}
