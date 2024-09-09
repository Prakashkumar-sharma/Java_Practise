package Interface;
interface Y{
    void m1();
}
interface X{
    void m2();
}
interface W{
    void m3();
}
class XY implements Y,X,W{
   public void m1(){
        System.out.println("m1-XY");
    }
     public void m2(){
         System.out.println("m2-XY");
     }
     public void m3(){
         System.out.println("m3-XY");
     }
}
public class Example3 {
    public static void main(String[] args) {
        Y y = new XY();
        y.m1();

        X x = new XY();
        x.m2();

        W w = new XY();
        w.m3();

    }
}