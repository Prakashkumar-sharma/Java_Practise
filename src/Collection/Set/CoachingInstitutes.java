package Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class CoachingInstitutes {
    public static void main(String[] args) {
        TreeSet list1 = new TreeSet<>();
        list1.add("BYJU'S");
        list1.add("Sri Ram IAS");
        list1.add("VajiRam & Ravi");
        list1.add("Dristi");
        list1.add("VajiRam & Reddy");
        System.out.println(list1);

        System.out.println("---------------");

        TreeSet list2 = new TreeSet<>(list1);
        list2.add("RAU'S");
        list2.add("Unacedmey");
        System.out.println(list2);

        System.out.println("---------------");

        TreeSet list3 = new TreeSet<>(list2);
        list3.add("Chanakya");
        list3.add("Paramount");
        System.out.println(list3);

        System.out.println("-----------------");

        System.out.println(list3.first());

        System.out.println("-----------------");

        System.out.println(list3.last());

        System.out.println(list3.higher("Chanakya"));

        System.out.println("------------------");

        System.out.println(list3.lower("Chanakya"));

        System.out.println("-------------------");

        System.out.println(list3.descendingSet());

        System.out.println("--------------------");

        System.out.println(list3.contains("Paramount"));

        System.out.println("---------------------");

        System.out.println(list3.floor("Chanakya"));

        System.out.println("--------------------");

        System.out.println(list3.ceiling("Chanakya"));

        System.out.println("--------------------------");

        for (Object object : list3){
            System.out.println(object);
        }

        System.out.println("------------------------");

        Iterator list4 = list3.iterator();
        while (list4.hasNext()){
            System.out.println(list4.next());
        }


    }
}
