package Array;

public class Availablity {
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50};
        int element = 40;
        boolean b = false;
        for (int i : number) {
            if (element == i)  {
                   b = true;
                   break;

            }
        }
        if(b){
            System.out.println(element + " is available ");
        }
        else {
            System.out.println("Element is not available ");
        }

    }
            }




