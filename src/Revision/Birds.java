package Revision;

public class Birds {
    String name;
    String category;

    public void birdDetails(){
        System.out.println("Name     : " + name);
        System.out.println("Category : " + category);
    }

    public static void main(String[] args) {
        Birds detail1 = new Birds();
        detail1.name = "Parrot";
        detail1.category = "Herbivorous";
        detail1.birdDetails();

        System.out.println("-----------------");

        Birds detail2 = new Birds();
        detail2.name = "Vulture";
        detail2.category = "Carnivorous";
        detail2.birdDetails();
    }
}
