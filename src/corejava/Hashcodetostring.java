package corejava;


class A{

}

public class Hashcodetostring {
    public static void main(String[] args) {
        A a = new A();
        int hashCode = a.hashCode();
        System.out.println(" Hashcode : " + hashCode);

        String refValue = a.toString();
        System.out.println(" Reference Value : " + refValue);
    }

}
