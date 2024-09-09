package corejava;
class Z{
    void m1(){
        System.out.println("Method M1");
        m2();
        this.m2();
    }
    void m2(){
        System.out.println("Method M2");
    }
}

public class Thismethodex1 {
    public static void main(String[] args) {
        Z detail = new Z();
        detail.m1();
    }
}
