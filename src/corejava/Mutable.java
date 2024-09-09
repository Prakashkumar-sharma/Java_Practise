package corejava;

public class Mutable {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Prakash");
        StringBuffer sb2 = sb1.append("Kumar");
        StringBuffer sb3 = sb2.append("Sharma");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println(sb1=sb2);
        System.out.println(sb2=sb3);
        System.out.println(sb3=sb1);
        System.out.println();
    }
}
