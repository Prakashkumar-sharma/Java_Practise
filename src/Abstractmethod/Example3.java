package Abstractmethod;
abstract class E{
    void m1(){
        System.out.println("m1-E");
    }

    abstract void m2();

    abstract void m3();
}

 class F extends E{
    void m2(){
        System.out.println("m2-F");
    }

     @Override
     void m3() {
         System.out.println("m3-F");
     }

     void m4(){
         System.out.println("m4-F");
     }
 }
public class Example3 {
    public static void main(String[] args) {
        E e = new F();
        e.m1();
        e.m2();
        e.m3();

        F f = new F();
        f.m1();
        f.m2();
        f.m3();
        f.m4();
    }
}
