package Interface;
interface Z {
    void m1();

    void m2();

    void m3();
}
    abstract class AB implements Z{
         public void m1() {
             System.out.println("m1-A");
         }
     }

class CD extends AB {
    @Override
    public void m2() {
        System.out.println("m2-B");
    }

    @Override
    public void m3() {
        System.out.println("m3-C");
    }
}

public class Example2 {
    public static void main(String[] args) {
        Z z = (Z) new CD();
        z.m1();
        z.m2();
        z.m3();
    }
}
