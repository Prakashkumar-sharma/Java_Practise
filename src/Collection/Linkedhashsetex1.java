package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashsetex1 {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
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
