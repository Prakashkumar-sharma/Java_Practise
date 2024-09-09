class Name {
    String initial;
    String middle;
    String subtitle;

    Name(){

    }
    Name(String first){
        initial=first;
    }
    Name(String first , String middlename){
        initial=first;
        middle=middlename;
    }
    Name(String first , String middlename , String last){
        initial=first;
        middle=middlename;
        subtitle=last;
    }
    public void naming(){
        System.out.println("Full Name : " + (initial + middle + subtitle));
    }
}
public class Constructoroverloadingex2 {
    public static void main(String[] args) {
        Name detail1 = new Name();
        detail1.naming();

        Name detail2 = new Name("Prakash");
        detail2.naming();

        Name detail3 = new Name("Prakash" , "Kumar");
        detail3.naming();

        Name detail4 = new Name("Prakash" , "Kumar" , "Sharma");
        detail4.naming();
    }
}
