package Collection;

import java.util.LinkedList;

public class linkedlistex1 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Durga");
        l.add(30);
        l.add(null);
        l.add("Durga");
        l.set(0,"Software");
        l.add(0,"Venky");
        l.removeLast();
        l.addFirst("CCC");
        System.out.println(l);

    }
}
