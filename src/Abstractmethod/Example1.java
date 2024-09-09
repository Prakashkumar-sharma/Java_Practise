package Abstractmethod;
abstract class A{
    abstract void m1();
}
class B extends A{
    void m1(){
        System.out.println("m1-B");
    }
}

public class Example1 {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
    }
}
