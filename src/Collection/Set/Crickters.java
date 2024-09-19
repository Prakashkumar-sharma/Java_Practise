package Collection.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Crickters {
    public static void main(String[] args) {
        LinkedHashSet list1 = new LinkedHashSet();
        list1.add("Sachin");
        list1.add("Hayden");
        list1.add("Kohli");
        list1.add("Pointing");
        list1.add("Dravid");
        list1.add("Imzamam");
        list1.add("Dhoni");
        System.out.println(list1);

        System.out.println("----------------------------");

        LinkedHashSet list2 = new LinkedHashSet<>(list1);
        list2.add("Kallis");
        list2.add("Warne");
        list2.add("Mcrath");
        list2.add("Akram");
        System.out.println(list2);

        System.out.println("------------------------------");

        System.out.println(list2.size());

        System.out.println("------------------------------");

        System.out.println(list2.contains("Dravid"));

        System.out.println("---------------------------------");

        System.out.println(list2.isEmpty());

        System.out.println("---------------------------------");

        System.out.println(list2.clone());

        System.out.println("------------------------------------");

        list1.addAll(list2);
        System.out.println(list1);

        System.out.println("---------------------------------------");

        list2.addAll(list1);
        System.out.println(list2);

        System.out.println("-----------------------------------------");

        for (Object object : list2){
            System.out.println(object);
        }

        System.out.println("-----------------------------------------");

        Iterator list3 = list2.iterator();
        while (list3.hasNext()){
            System.out.println(list3.next());
        }




    }
}
