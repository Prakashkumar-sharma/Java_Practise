package Revision;
class Location{
    String city;
    String state;
    String country;

    public void city(){
        System.out.println("City : " + city);
        this.state();
        this.country();
    }
    public void state(){
        System.out.println("State : " + state);
    }
    public void country(){
        System.out.println("Country : " + country);
    }
}

public class City {
    public static void main(String[] args) {
        Location detail1 = new Location();
        detail1.city = "Bokaro Steel City";
        detail1.state = "Jharkhand";
        detail1.country = "India";
        detail1.city();

    }
}
