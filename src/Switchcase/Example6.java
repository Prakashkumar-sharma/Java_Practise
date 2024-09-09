package Switchcase;

public class Example6 {
    public static void main(String[] args) {
        final int x = 15, y = 20, z = 25, a = 10, b = 5;
        switch (y) {
            case a:
                System.out.println("10");
                break;
            case b:
                System.out.println("5");
                break;
            case x:
                System.out.println("15");
                break;
            case y:
                System.out.println("20");
                break;
            case z:
                System.out.println("25");
                break;
            default:
                System.out.println("int value must be 5,10,15 and 20");
                break;
        }
    }
}
