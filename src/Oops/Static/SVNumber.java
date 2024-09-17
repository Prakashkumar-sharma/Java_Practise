package Oops.Static;
class Number{

    int x = 10;
    static int y = 20;

     public void values(){
        System.out.println("Value of x : " + x);
        System.out.println("Value of static variable y : " + this.y);
    }
}

public class SVNumber {
    public static void main(String[] args) {
     Number value = new Number();
        value.values();

        System.out.println("------------------");

        System.out.println("Value of static variable y : " + Number.y);

        System.out.println("------------------------------");

        System.out.println("Value of instance variable x : " + value.x);

        System.out.println("Value of static variable y : " + value.y);
    }
}
