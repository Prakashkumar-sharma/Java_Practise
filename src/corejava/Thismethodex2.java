package corejava;
class City{
    void town(){
        System.out.println("Bokaro");
        this.district();
        this.place();

    }
    void district(){
        System.out.println("Steel");
    }
    void place(){
        System.out.println("City");
    }
}

public class Thismethodex2 {
    public static void main(String[] args) {
        City detail = new City();
        detail.town();
    }
}
