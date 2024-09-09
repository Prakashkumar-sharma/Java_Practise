package corejava;
class Gadget{
    String gadgettype;
    String brandname;
    String status;

    public Gadget(String device, String brand, String availability){
        gadgettype=device;
        brandname=brand;
        status=availability;
    }
    public void getGadgetdetail(){
        System.out.println("Gadgets detail : ");
        System.out.println("----------------------");
        System.out.println("Gadget : " + gadgettype + "  , " +  " Brand name : " + brandname + " , " +  " Status : " + status);
    }
}

public class Constructionexgadget {
    public static void main(String[] args) {
        Gadget detail1 = new Gadget("Television" , "Mi , Samsung , Haier" , "Available");
        detail1.getGadgetdetail();
        System.out.println();

        Gadget detail2 = new Gadget("Refrigerator" , "Samsung , LG , Haier" , "Available");
        detail2.getGadgetdetail();
        System.out.println();

        Gadget detail3 = new Gadget("Geyser" , "Bajaj , Usha , Havells" , "Available");
        detail3.getGadgetdetail();
        System.out.println();

        Gadget detail4 = new Gadget("RO" , "Livpure , Havells , Bluestar" , "Available");
        detail4.getGadgetdetail();
    }
}
