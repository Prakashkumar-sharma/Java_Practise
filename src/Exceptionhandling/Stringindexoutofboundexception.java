package Exceptionhandling;

public class Stringindexoutofboundexception {
    public static void main(String[] args) {
        String str = new String("xyz");
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
    }
}
