package LinkList;

import java.util.LinkedList;

public class Names {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList();
        names.add("Prakash");
        names.add("Vikram");
        names.add("Akshay");
        names.add("Shubham");
        names.add("Vedant");
        System.out.println(names);

        System.out.println("---------------------");

        names.add(4,"Mahesh");

        System.out.println(names);

        System.out.println("------------------------");

        names.remove(5);
        System.out.println(names);

        System.out.println("---------------------------");

        names.addFirst("Prabhat");
        System.out.println(names);

        System.out.println("---------------------------");

        names.addLast("Jitesh");
        System.out.println(names);

        System.out.println("----------------------------");

        names.removeFirst();
        System.out.println(names);

        System.out.println("----------------------------");

        names.removeLast();
        System.out.println(names);

        System.out.println("---------------------------");

        System.out.println(names.getFirst());

        System.out.println("----------------------------");

        System.out.println(names.getLast());

        System.out.println("--------------------------");

        System.out.println(names.getClass());

        System.out.println("-------------------------");

        System.out.println(names.get(3));
    }
}
