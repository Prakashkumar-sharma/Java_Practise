package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class NamesHS {
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

//        for (int i = 0; i < names.size() ; i++){
//            System.out.println(names.get(i));
//        }

        for (Object object : names){
            System.out.println(object);
        }

        System.out.println("-----------------------------");

        Iterator it = names.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }




    }
}
