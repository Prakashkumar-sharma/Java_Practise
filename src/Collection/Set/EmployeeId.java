package Collection.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class EmployeeId {
    public static void main(String[] args) {
        LinkedHashSet list1 = new LinkedHashSet<>(10);
        list1.add("Ayush : " + 12345);
        list1.add("Abhishek : " + 58964);
        list1.add("Sashikant : " + 74589);
        list1.add("Pikit : " + 95874);
        list1.add("Adarsh : " + 85479);
        System.out.println(list1);

        System.out.println("-----------------------");

        LinkedHashSet list2 = new LinkedHashSet<>(list1);
        list2.add("Valmiki : " + 47896);
        list2.add("Saroj : " + 25698);
        list2.add("Prashant : " + 35698);
        System.out.println(list2);

        System.out.println("-------------------------");

        System.out.println(list2.clone());

        System.out.println("--------------------------");

        System.out.println(list2.isEmpty());

        System.out.println("---------------------------");

        System.out.println(list2.size());

        System.out.println("---------------------------");

        System.out.println(list2.contains("Victor : " + 56854));

        System.out.println("----------------------------");

        for (Object object : list2){
            System.out.println(object);
        }

        System.out.println("-------------------------");

        Iterator list3 = list2.iterator();
        while (list3.hasNext()){
            System.out.println(list3.next());
        }


    }
}
