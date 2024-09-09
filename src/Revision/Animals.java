package Revision;

public class Animals {
    String name;
    String type;
    String category;

    public void animalsDetail(){
        System.out.println("Name     : " + name);
        System.out.println("Type     : " + type);
        System.out.println("Category : " + category);

    }

    public static void main(String[] args) {
        Animals detail1 = new Animals();
        detail1.name = "Lion";
        detail1.type = "Wild";
        detail1.category = "Carnivorous";
        detail1.animalsDetail();

        System.out.println("------------------");

        Animals detail2 = new Animals();
        detail2.name="Cow";
        detail2.type="Domestic";
        detail2.category="Herbivorous";
        detail2.animalsDetail();
    }
}
