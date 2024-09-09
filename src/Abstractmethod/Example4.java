package Abstractmethod;
abstract class M{
    void m1(){
        System.out.println("m1-M");
    }

    void m2(){
        System.out.println("m2-M");
    }
}

class N extends M{

}
public class Example4 {
    public static void main(String[] args) {
        M m = new N();
        m.m1();
        m.m2();
    }
}
