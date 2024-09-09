package Collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmapex1 {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("one", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);
        numbers.put("Six", 6);

        numbers.remove("Six");

        System.out.println(numbers);

        numbers.putIfAbsent("Three", 30);
        System.out.println(numbers);

        System.out.println(numbers.containsValue(4));

        System.out.println(numbers.isEmpty());


        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e);

            System.out.println(e.getKey());

            System.out.println(e.getValue());

            for (String key : numbers.keySet()){
                System.out.println(key);
            }


            for (Integer values : numbers.values()){
                System.out.println(values);
            }

        }
    }
}
