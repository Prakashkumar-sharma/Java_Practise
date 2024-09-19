package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Food {
    public static void main(String[] args) {
        HashSet names = new HashSet();
        names.add("Momos");
        names.add("Burger");
        names.add("Noodles");
        names.add("French fries");
        names.add("Pizza");

        System.out.println(names);

        System.out.println("------------------------");

        HashSet name = new HashSet(names);
        name.add("Tacos");
        name.add("Manchurian");
        name.add("Pasta");

        System.out.println(name);

        System.out.println("-------------------");


        System.out.println(name.clone());

        System.out.println("----------------------");

        System.out.println(name.size());

        System.out.println("-----------------------");

        System.out.println(name.isEmpty());

        System.out.println("------------------------");

        System.out.println(name.contains("Noodles"));

        System.out.println("-------------------------");

        System.out.println(name.iterator());

        System.out.println("--------------------------");

        System.out.println(name.stream().iterator());

        System.out.println("--------------------------");

        name.remove("Tacos");
        System.out.println(name);

        System.out.println("-------------------------------");

        for (Object object : name){
            System.out.println(object);
        }

        System.out.println("-----------------------------");

        Iterator food = name.iterator();
        while (food.hasNext()){
            System.out.println(food.next());
        }







    }
}
