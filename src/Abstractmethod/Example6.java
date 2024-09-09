package Abstractmethod;
class G{
    void m1(){
        System.out.println("m1-G");
    }
}
abstract class H extends G{
    void m2(){
        System.out.println("m2-H");
    }
    abstract void m3();
    abstract void m4();

}
class I extends H{
    void m3(){
        System.out.println("m3-I");
    }
    void m4(){
        System.out.println("m4-I");
    }
}

public class Example6 {
    public static void main(String[] args) {
        G g = new I();
        g.m1();

        H h = new I();
        h.m1();
        h.m2();
        h.m3();
        h.m4();

        I i = new I();
        i.m1();
        i.m2();
        i.m3();
        i.m4();
    }
}
