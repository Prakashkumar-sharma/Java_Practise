package Methodoverloading;
class PersonDetails{
    public void detail(String name, int age){
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
    }
    public void detail(String name , float age , String address){
        System.out.println("Name    : "    + name);
        System.out.println("Age     : "    + age);
        System.out.println("Address : " + address);
    }
    public void detail(String name , float age , String address,double salary){
        System.out.println("Name    : "    + name);
        System.out.println("Age     : "    + age);
        System.out.println("Address : " + address);
        System.out.println("Salary  : " + salary);
    }
}
public class Example4 {
    public static void main(String[] args) {
        PersonDetails detail = new PersonDetails();
        detail.detail("Rishi" , 30);

        System.out.println("--------------------------------");
        detail.detail("Dev", 32.6f , "Noida");

        System.out.println("----------------------------------");

        detail.detail("Ved" , 35.9f , "Bengluru" , 3000000.00);
    }
}
