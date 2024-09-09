package corejava;

class Car{
    public void startEngine(){
        System.out.println(" Engine has started ");
    }

    public void changeGear(){
        System.out.println(" Gear has changed ");
    }
    public void move(){
        System.out.println( " Vechile is moving ");
    }
}
 class Vechile{
    public void drive(Car car){
        car.startEngine();
        car.changeGear();
        car.move();
    }

 }

public class Driving {
    public static void main(String[] args) {
        Car car = new Car();
        Vechile vechile = new Vechile();
        vechile.drive(car);
    }
}
