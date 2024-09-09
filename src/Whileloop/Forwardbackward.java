package Whileloop;

public class Forwardbackward {
    public static void main(String[] args) {
        int num = 156;
        int digit = 0;
        String forwardNumber = "";
        String backwardNumber = "";
        System.out.println(num);
        while(num != 0){
            digit = num % 10;
            forwardNumber = digit + "  " + forwardNumber;
            backwardNumber = backwardNumber + digit + "  ";
            num = num / 10;
        }
        System.out.println("Number In Forward  : " + forwardNumber);
        System.out.println("Number In Backward : " + backwardNumber);
    }

}
