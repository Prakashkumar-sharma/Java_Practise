package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Treesetex2 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(5);
        set.add(40);
        set.add(30);
        System.out.println(set);

        System.out.println(set.remove(5));
        System.out.println(set);

        System.out.println(set.contains(40));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}
