package Revision;
class Cleaning{
    String brandName;
    String color;
     public void washing(){
         System.out.println("Brand Name : " + brandName);
         System.out.println("Color : " + color);
         System.out.println("Clothes washing is operating");
         this.drying();
     }
     public void drying(){
         System.out.println("Clothes is drying");
     }
}

public class WashingMachine {
    public static void main(String[] args) {
        Cleaning clothes = new Cleaning();
        clothes.brandName = "Haier";
        clothes.color = "Black";
        clothes.washing();
    }

}
