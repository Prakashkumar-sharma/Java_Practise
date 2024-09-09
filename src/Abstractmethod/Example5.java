package Abstractmethod;
abstract class X{
    abstract void m1();
    abstract void m2();
    abstract void m3();

}
abstract class Y extends X{
    void m1(){
        System.out.println("m1-Y");
    }

    @Override
    void m2() {
        System.out.println("m2-Y");
    }
}
class Z extends Y{
    @Override
    void m3() {
        System.out.println("m3-Z");
    }
}

public class Example5 {
    public static void main(String[] args) {
        X x = new Z();
        x.m1();
        x.m2();
        x.m3();
    }

}
