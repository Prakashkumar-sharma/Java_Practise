package Revision;
class PenDetails{
    String color;
    String type;
    String brand;

    public  void detail(){
        System.out.println("Brand name : " + brand);
        System.out.println("Type       : " + type);
        System.out.println("Color      : " + color);
    }


}

public class Pen {
    public static void main(String[] args) {
       PenDetails pen1 = new PenDetails();
       pen1.color = "Blue";
       pen1.type = "Gel";
       pen1.brand = "Rotomac";
       pen1.detail();

        System.out.println("-----------------------");

       PenDetails pen2 = new PenDetails();
        pen2.color = "Black";
        pen1.type = "Ball";
        pen1.brand = "Natraj";
        pen1.detail();




    }
}
