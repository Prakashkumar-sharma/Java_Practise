package Methodoverriding;
class C{
    static void m1(){
        System.out.println("m1-C");
    }
}
class D extends C{
    static void m1(){
        System.out.println("m1-D");
    }
}
public class Hiding {
    public static void main(String[] args) {
        C c = new D();
        c.m1();

    }
}
