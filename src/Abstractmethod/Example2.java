package Abstractmethod;
abstract class C{
 void m1(){
     System.out.println("m1-A");
 }
 abstract void m2();

 abstract void m3();
}

class D extends C{
    void m2(){
        System.out.println("m2-B");
    }

    @Override
    void m3() {
        System.out.println("m3-B");
    }
}

public class Example2 {
    public static void main(String[] args) {
        C c = new D();
        c.m1();
        c.m2();
        c.m3();
    }
}
