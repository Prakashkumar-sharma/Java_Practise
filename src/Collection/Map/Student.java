package Collection.Map;

import java.util.HashMap;
import java.util.Iterator;

public class Student {
    public static void main(String[] args) {
        HashMap<String , Integer> list1 = new HashMap<>();
        list1.put("Harry" , 10);
        list1.put("Micheal" , 11);
        list1.put("Chris" , 12);
        list1.put("Scarlett" , 9);
        list1.put("Kate" , 8);

        System.out.println(list1);

        System.out.println("----------------");

        System.out.println(list1.keySet());

        System.out.println("----------------");

        System.out.println(list1.size());

        System.out.println("-----------------");

        System.out.println(list1.entrySet());

        System.out.println("------------------");

        System.out.println(list1.values());

        System.out.println("-----------------");

         for(String name : list1.keySet()) {
             System.out.println(name);
         }

        System.out.println("-----------------");

         for (Integer standard : list1.values()){
             System.out.println(standard);
         }

        System.out.println("------------------");

         Iterator list2 = list1.keySet().iterator();
         while (list2.hasNext()){
             System.out.println(list2.next());
         }

        System.out.println("---------------------");

         Iterator list3 = list1.values().iterator();
         while (list3.hasNext()){
             System.out.println(list3.next());
         }

        System.out.println("---------------------------");

         HashMap<String , Integer> list4 = new HashMap<>(list1);
         list4.put("Robert" , 6);
         list4.put("Monica" , 7);
         list4.put("Liam" , 5);
         System.out.println(list4);

        System.out.println("--------------------------");

        for (String list5 : list4.keySet()){
            System.out.println(list5);
        }

        System.out.println("-------------------------");

        for (int values : list4.values()){
            System.out.println(values);
        }

        System.out.println("-------------------------");

        Iterator list6 = list4.keySet().iterator();
        while (list6 .hasNext()){
            System.out.println(list6.next());
        }

        System.out.println("--------------------------");

        Iterator list7 = list4.values().iterator();
        while (list7.hasNext()){
            System.out.println(list7.next());
        }




    }
}
