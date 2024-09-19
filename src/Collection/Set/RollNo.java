package Collection.Set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class RollNo {
    public static void main(String[] args) {
        SortedSet list1 = new TreeSet();
        list1.add(20);
        list1.add(10);
        list1.add(30);
        list1.add(5);
        list1.add(1);
        list1.add(15);
        System.out.println(list1);

        System.out.println("------------------");

        System.out.println(list1.first());

        System.out.println("---------------------");

        System.out.println(list1.last());

        System.out.println("-------------------");

        System.out.println(list1.stream().sorted());

        System.out.println("--------------------");

        System.out.println(list1.headSet(10));

        System.out.println("--------------------");

        System.out.println(list1.tailSet(10));

        System.out.println("--------------------");

        System.out.println(list1.contains(7));

        System.out.println("-------------------------");

        SortedSet list2 = new TreeSet(list1);
        list2.add(25);
        list2.add(7);
        list2.add(2);
        list2.add(5);
        list2.add(10);
        System.out.println(list2);

        System.out.println("--------------------------");

        for (Object object : list2){
            System.out.println(object);
        }

        System.out.println("-----------------------");

        Iterator list3 = list2.iterator();
        while (list3.hasNext()){
            System.out.println(list3.next());
        }



    }
}
