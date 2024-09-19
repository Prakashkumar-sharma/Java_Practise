package Collection.Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Numbers {
    public static void main(String[] args) {
        TreeSet list1 = new TreeSet<>();
        list1.add(100);
        list1.add(80);
        list1.add(120);
        list1.add(50);
        list1.add(110);
        System.out.println(list1);

        System.out.println("-----------------");

        System.out.println(list1.ceiling(116));

        System.out.println("--------------------");

        System.out.println(list1.clone());

        System.out.println("----------------------");

        Comparator list2 = list1.comparator();
        System.out.println(list2);

        System.out.println("------------------------");

        System.out.println(list1.contains(50));

        System.out.println("-------------------------");

        System.out.println(list1.first());

        System.out.println("-------------------------");

        System.out.println(list1.descendingSet());

        System.out.println("--------------------------");

        System.out.println(list1.floor(70));

        System.out.println("-------------------------");

        System.out.println(list1.headSet(100));

        System.out.println("-------------------------");

        System.out.println(list1.higher(100));

        System.out.println("--------------------------");

        System.out.println(list1.last());

        System.out.println("--------------------------");

        System.out.println(list1.lower(110));


        System.out.println("---------------------------------");

        for (Object object : list1){
            System.out.println(object);
        }

        System.out.println("-------------------------------");

        Iterator list3 = list1.iterator();
        while (list3.hasNext()){
            System.out.println(list3.next());
        }


    }
}
