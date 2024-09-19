package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Country {
    public static void main(String[] args) {
        HashSet names = new HashSet(10);
        names.add("India");
        names.add("Sri Lanka");
        names.add("Vietnam");
        names.add("Indonesia");
        names.add("UAE");
        System.out.println(names);

        System.out.println("-------------------");


        System.out.println(names.clone());

        System.out.println("----------------------");

        System.out.println(names.size());

        System.out.println("-----------------------");

        System.out.println(names.isEmpty());

        System.out.println("------------------------");

        System.out.println(names.contains("Maldives"));

        System.out.println("-------------------------");

        System.out.println(names.iterator());

        System.out.println("--------------------------");

        System.out.println(names.stream().iterator());

        System.out.println("--------------------------");

        names.remove("Vietnam");
        System.out.println(names);

        System.out.println("-------------------------------");

        for (Object object : names){
            System.out.println(object);
        }

        System.out.println("-----------------------------");

        Iterator country = names.iterator();
        while (country.hasNext()){
            System.out.println(country.next());
        }





    }
}
