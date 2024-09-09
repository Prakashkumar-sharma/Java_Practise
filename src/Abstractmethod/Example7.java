package Abstractmethod;
abstract class J{
    J(){
        System.out.println("m1-J");
    }
}
class K extends J{
    K(){
        System.out.println("m2-K");
    }
}
class L extends K{

    L(){
        System.out.println("m3-L");
    }
}
public class Example7 {
    public static void main(String[] args) {
        L l = new L();
    }
}
