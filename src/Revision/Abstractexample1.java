package Revision;
abstract class A{
    void m1(){
        System.out.println("m1-A");
    }
     abstract void m2();
     abstract void m3();
}
   class B extends A{
       @Override
       void m2() {
           System.out.println("m2-B");
       }

       @Override
       void m3() {
           System.out.println("m3-B");
       }
       void m4(){
           System.out.println("m4-B");
       }
   }

public class Abstractexample1 {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
        a.m2();
        a.m3();

        System.out.println("------------------------");

        B b = new B();
        b.m1();
        b.m2();
        b.m3();
        b.m4();


    }

}
