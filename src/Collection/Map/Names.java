package Collection.Map;

import Collection.Hashmapex1;

import java.util.HashMap;
import java.util.Iterator;

public class Names {
    public static void main(String[] args) {
        HashMap list = new HashMap();
        list.put(1 , "Prakash");
        list.put(2 , "Vikram");
        list.put(3 , "Mritunjay");
        list.put(4 , "Ravi");
        list.put(5 , "Shiv");
        System.out.println(list);

        System.out.println("----------------");

        list.put(4, "Sandeep");
        System.out.println(list);

        System.out.println("-----------------");

        System.out.println(list.get(4));

        System.out.println("---------------------");

        System.out.println(list.isEmpty());

        System.out.println("----------------------");

        System.out.println(list.size());

        System.out.println("-----------------------");

        System.out.println(list.clone());

        System.out.println("------------------------");

        System.out.println(list.containsKey(2));

        System.out.println("---------------------------");

        list.replace(4,"Mahesh");
        System.out.println(list);

        System.out.println("--------------------------");

        System.out.println(list.keySet());

        System.out.println("-------------------------");

        Iterator list2 = list.keySet().iterator();
        while (list2.hasNext()){
            System.out.println(list2.next());
        }

        System.out.println("----------------------");

        Iterator list3 = list.values().iterator();
        while (list3.hasNext()){
            System.out.println(list3.next());
        }

        System.out.println("----------------------");

        for (Object object : list.keySet()){
            System.out.println(object);
        }

        System.out.println("----------------------");

        for (Object object : list.values()){
            System.out.println(object);
        }




    }
}
