package Switchcase;

public class Example3 {
    public static void main(String[] args) {
        String str = "FFF";
        switch (str){
            case "AAA":
                System.out.println("AAA");
                break;

            case "BBB":
                System.out.println("BBB");
                break;

            case "CCC":
                System.out.println("CCC");
                break;

            case "DDD":
                System.out.println("DDD");
                break;
            default:
                System.out.println("Default");
                break;

        }
    }
}
