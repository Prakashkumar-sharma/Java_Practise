package Collection.Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Colors {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("White");
        list1.add("Black");
        list1.add("Blue");
        list1.add("Red");
        list1.add("Green");
        list1.add("Pink");
        list1.add("Yellow");
        System.out.println(list1);

        System.out.println("---------------------");

        Iterator list2 = list1.iterator();
        while (list2.hasNext()){
            System.out.println(list2.next());
        }

        System.out.println("-------------------");

        list1.add(0 , "Violet");
        System.out.println(list1);

        System.out.println("-------------------");

        System.out.println(list1.get(2));

        System.out.println("--------------------");

        list1.set(4 , "Maroon");
        System.out.println(list1);

        System.out.println("--------------------");

        list1.remove(3);
        System.out.println(list1);

        System.out.println("--------------------");

        System.out.println(list1.contains("Maroon"));

        System.out.println("---------------------");

        Collections.sort(list1);
        System.out.println(list1);
    }
}
