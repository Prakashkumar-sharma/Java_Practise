package Oops.Static;
class Sum{
    int x = 10;
    static int y = 10;
}

public class Addition {
    public static void main(String[] args) {
        Sum first = new Sum();
        System.out.println("x : " + first.x + "  ,  " + "y : " + first.y);
        first.x = first.x + 1;
        first.y = first.y + 1;
        System.out.println("x : " + first.x + "  ,  " + "y : " + first.y);

        System.out.println("-------------------------------------------");

        Sum second = new Sum();
        System.out.println("x : " + second.x + "  ,  " + "y : " + second.y);
        second.x = second.x + 1;
        second.y = second.y + 1;
        System.out.println("x : " + second.x + "  ,  " + "y : " + second.y);
        System.out.println("x : " + first.x + "  ,  " + "y : " + first.y);

        System.out.println("--------------------------------------------");

        Sum third = new Sum();
        System.out.println("x : " + third.x + "  ,  " + "y : " + third.y);
        third.x = third.x + 1;
        third.y = third.y + 1;
        System.out.println("x : " + third.x + "  ,  " + "y : " + third.y);
        System.out.println("x : " + second.x + "  ,  " + "y : " + second.y);
        System.out.println("x : " + first.x + "  ,  " + "y : " + first.y);


    }
}
