package Collection;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList ab = new java.util.ArrayList();
        ab.add(1);
        ab.add("abc");
        System.out.println(ab);
        java.util.ArrayList cd = new java.util.ArrayList(ab);
        cd.add("3");
        cd.add("bc");
        System.out.println(cd);

        System.out.println("----------------------------");

        java.util.ArrayList ar = new java.util.ArrayList();
        ar.add(1);
        ar.add("abc");
        System.out.println(ar);
        java.util.ArrayList br = new java.util.ArrayList();
        br.add("2");
        br.add("bc");
        br.addAll(ar);
        System.out.println(br);




    }
}
