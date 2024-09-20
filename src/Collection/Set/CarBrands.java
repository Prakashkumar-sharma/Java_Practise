package Collection.Set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class CarBrands {
    public static void main(String[] args) {
        SortedSet list1 = new TreeSet();
        list1.add("Tata");
        list1.add("Toyota");
        list1.add("Tesla");
        list1.add("Hyundai");
        list1.add("Chevrolet");
        System.out.println(list1);

        System.out.println("---------------------");

        SortedSet list2 = new TreeSet(list1);
        list2.add("BMW");
        list2.add("Audi");
        System.out.println(list2);

        System.out.println("----------------------");

        SortedSet list3 = new TreeSet(list2);
        list3.add("Porsche");
        list3.add("Kia");
        System.out.println(list3);

        System.out.println("------------------------");

        System.out.println(list3.contains("Toyota"));

        System.out.println("----------------------");

        System.out.println(list3.headSet("Tesla"));

        System.out.println("-------------------------");

        System.out.println(list3.tailSet("Tesla"));

        System.out.println("----------------------------");

        System.out.println(list3.first());

        System.out.println("----------------------------");

        System.out.println(list3.last());

        System.out.println("----------------------------");

        System.out.println(list3.equals("Kia"));

        System.out.println("----------------------------");

        for (Object object : list3){
            System.out.println(object);
        }

        System.out.println("---------------------------");

        Iterator list4 = list3.iterator();
        while (list4.hasNext()){
            System.out.println(list4.next());
        }



    }
}
