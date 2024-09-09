package Revision;

public class Human {
    String name;
    int age;
    String height;
    public void individualDetail(){
        System.out.println(" Name   : " + name);
        System.out.println(" Age    : " + age);
        System.out.println(" Height :"  + height );
    }

    public static void main(String[] args) {
        Human detail1 = new Human();
        detail1.name="Vedant";
        detail1.age= 32;
        detail1.height=" 5 feet 6 inches";
        detail1.individualDetail();

        System.out.println("-----------------");

        Human detail2 = new Human();
        detail2.name="Vikram";
        detail2.age= 32;
        detail2.height=" 5 feet 11 inches";
        detail2.individualDetail();
    }

}
