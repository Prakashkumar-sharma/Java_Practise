package Switchcase;

public class Example1 {
    public static void main(String[] args) {
        int x = 15;
        switch (x) {
            case 5:
                System.out.println("FIVE");
                break;
            case 10:
                System.out.println("TEN");
                break;
            case 15:
                System.out.println("FIFTEEN");
                break;
            case 20:
                System.out.println("TWENTY");
                break;
            default:
                System.out.println("int value must be 5,10,15 and 20");
                break;
        }
    }
}
