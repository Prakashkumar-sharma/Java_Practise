package Revision;
class CarDetails{
    String brand;
    String type;
    String color;

    public void detail(){
        System.out.println("Brand : " + brand);
        System.out.println("Type  : " + type);
        System.out.println("Color : " + color);
    }
}

public class Car {
    public static void main(String[] args) {
        CarDetails car1 = new CarDetails();
        car1.brand = "Tata";
        car1.type = "Electric car";
        car1.color = "Black";
        car1.detail();

        System.out.println(".........................");

        CarDetails car2 = new CarDetails();
        car2.brand = "Mahindra";
        car2.type = "XUV";
        car2.color = "White";
        car2.detail();

    }
}
