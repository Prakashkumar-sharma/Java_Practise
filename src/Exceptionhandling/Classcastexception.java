package Exceptionhandling;
class A{

}
class B extends A{

}

public class Classcastexception {
    public static void main(String[] args) {
        A a = new A();
        B b = (B) a;
    }
}
