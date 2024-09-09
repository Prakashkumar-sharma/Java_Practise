package Switchcase;

public class Example4 {
    public static void main(String[] args) {

        byte x = 115;
        switch (x) {
            case 125:
                System.out.println("125");
                break;
            case 120:
                System.out.println("120");
                break;
            case 115:
                System.out.println("115");
                break;
            case 127:
                System.out.println("127");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
