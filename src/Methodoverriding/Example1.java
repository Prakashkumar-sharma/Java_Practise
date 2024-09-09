package Methodoverriding;
class A {
    void m1() {
        System.out.println(" m1-A ");
    }
}
 class B extends A{
        void m1(){
            System.out.println(" m1-B ");
        }
 }

public class Example1 {
    public static void main(String[] args) {
//       A a = new A();
//       a.m1();
//
//       B b = new B();
//       b.m1();

       A a = new B();
       a.m1();





    }
}
