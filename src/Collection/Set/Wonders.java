package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Wonders {
    public static void main(String[] wonders) {
        HashSet sevenWonders = new HashSet(10);
        sevenWonders.add("Taj Mahal ---- India ");
        sevenWonders.add("Great Wall ---- China ");
        sevenWonders.add("Colosseum ---- Itlay ");
        sevenWonders.add("Christ the Redeemer---- Brazil ");
        sevenWonders.add("Machu Picchu ---- Peru ");
        System.out.println(sevenWonders);

        System.out.println("-------------------");


        System.out.println(sevenWonders.clone());

        System.out.println("----------------------");

        System.out.println(sevenWonders.size());

        System.out.println("-----------------------");

        System.out.println(sevenWonders.isEmpty());

        System.out.println("------------------------");

        System.out.println(sevenWonders.contains("Taj Mahal ---- India "));

        System.out.println("-------------------------");

        HashSet total = new HashSet(sevenWonders);
        total.add("Petra ---- Jordan");
        total.add("Chichén Itzá ---- Mexico ");
        System.out.println(total);

        System.out.println("-----------------------------");

        for (Object object : total){
            System.out.println(object);
        }

        System.out.println("---------------------------------");

        Iterator wonder = total.iterator();
        while (wonder.hasNext()){
            System.out.println(wonder.next());
        }



    }
}
