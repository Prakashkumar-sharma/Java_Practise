package Collection.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Alphabets {
    public static void main(String[] args) {
        LinkedHashSet letters = new LinkedHashSet<>();
        letters.add("A");
        letters.add(1);
        letters.add("B");
        letters.add(2);
        letters.add(null);
        letters.add("C");
        letters.add(3);
        System.out.println(letters);

        System.out.println("------------------------");

        System.out.println(letters.clone());

        System.out.println("------------------------");

        System.out.println(letters.isEmpty());

        System.out.println("--------------------------");

        System.out.println(letters.contains(null));

        System.out.println("-------------------------");

        System.out.println(letters.size());

        System.out.println("-------------------------");

        LinkedHashSet numbers = new LinkedHashSet<>(letters);
        numbers.add("D");
        numbers.add(4);
        numbers.add(null);
        numbers.add("E");
        numbers.add(5);
        System.out.println(numbers);

        System.out.println("--------------------------");

        System.out.println(numbers.size());

        System.out.println("----------------------------");

        for (Object object : numbers){
            System.out.println(object);
        }

        System.out.println("-----------------------------");

        Iterator all = numbers.iterator();
        while (all.hasNext()){
            System.out.println(all.next());
        }
    }
}
