package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Names {
    public static void main(String[] args) {
        HashSet  names = new HashSet();
        names.add("Prakash");
        names.add("Vikram");
        names.add("Mritunjay");
        names.add("Ravi");
        names.add("Indrajeet");
        System.out.println(names);

        System.out.println("-------------------");


        System.out.println(names.clone());

        System.out.println("----------------------");

        System.out.println(names.size());

        System.out.println("-----------------------");

        System.out.println(names.isEmpty());

        System.out.println("------------------------");

        System.out.println(names.contains("Ravi"));

        System.out.println("-------------------------");

        System.out.println(names.iterator());

        System.out.println("--------------------------");

        System.out.println(names.stream().iterator());

        System.out.println("--------------------------");

        names.remove("Indrajeet");
        System.out.println(names);

        System.out.println("-------------------------------");

        for (Object object : names){
            System.out.println(object);
        }

        System.out.println("-----------------------------");

        Iterator identity = names.iterator();
        while (identity.hasNext()){
            System.out.println(identity.next());
        }






    }
}
