package corejava;

public class Immutableex1 {
    public static void main(String[] args) {
        String str1 = new String("Prakash");
        String str2 = str1.concat("Kumar");
        String str3 = str2.concat("Sharma");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str1=str2);
        System.out.println(str2=str3);
        System.out.println(str3=str1);
        System.out.println();
    }
}
