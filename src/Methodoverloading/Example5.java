package Methodoverloading;
class Name{
    public void nameDetail(String firstName , String lastName , int age){
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("Age        : " + age);
    }
    public void nameDetail( int age , String lastName , String firstName){
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("Age        : " + age);

    }
}
public class Example5 {
    public static void main(String[] args) {
        Name detail = new Name();
        detail.nameDetail("Abhijeet", "Keshav" ,32);

        System.out.println("---------------------------------------------");

        detail.nameDetail(40 , "Singh" , "Vipul Pratap");
    }
}
