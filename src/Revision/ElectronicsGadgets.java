package Revision;
class Gadgets{
    String name;
    String brand;
    String size;
    String color;

    public void details(){
        System.out.println("Gadget name : " + this.name);
        System.out.println("Brand name  : " + this.brand);
        System.out.println("Size        : " + this.size);
        System.out.println("Color       : " + this.color );
    }
}

public class ElectronicsGadgets {
    public static void main(String[] args) {
        Gadgets gadget1 = new Gadgets();
        gadget1.name = "Kettle";
        gadget1.brand = "Prestige";
        gadget1.size = "1.5L";
        gadget1.color = "Silver";
        gadget1.details();

        System.out.println("-----------------------");

        Gadgets gadget2 = new Gadgets();
        gadget2.name = "Trimmer";
        gadget2.size = "6 inches";
        gadget2.brand = "Philips";
        gadget2.color = "Black";
        gadget2.details();

        System.out.println("-------------------------------");

        Gadgets gadget3 = new Gadgets();
        gadget3.name = "Television";
        gadget3.brand = "Haier";
        gadget3.size = "55 inches";
        gadget3.color = "Black";
        gadget3.details();

        System.out.println("-------------------------------");

        Gadgets gadget4 = new Gadgets();
        gadget4.name = "Mobile";
        gadget4.brand = "Samsung";
        gadget4.size = "5 inches";
        gadget4.color = "Black";
        gadget4.details();
    }
}
