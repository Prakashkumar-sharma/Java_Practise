package corejava;
class B{

}

public class Tostringex1 {
    public static void main(String[] args) {
        B b = new B();
        String ref = b.toString();
        System.out.println(ref);
        System.out.println(b.toString());
        System.out.println(b);
    }
}
