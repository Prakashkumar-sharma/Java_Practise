package collection.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Train{
    public static void main(String[] args) {
        ArrayList detail = new ArrayList();
        detail.add("Magadh Express " + 12234);
        detail.add("Swarn Jayanti " + 12290);
        detail.add("Purvottar Express " + 12567);
        detail.add("Neelanchal Express " + 18034);
        detail.add("Purushottam Express " + 18060);
        detail.add("Swarn Jayanti Express " + 18060);

        System.out.println(detail);

        System.out.println("---------------------");

        System.out.println(detail.remove(2));

        System.out.println("-----------------------");

        System.out.println(detail);

        System.out.println("-----------------------");

        System.out.println(detail.get(2));

        System.out.println("-----------------------");

        System.out.println(detail.lastIndexOf(4));

        System.out.println("----------------------------");

        ArrayList detail2 = new ArrayList(detail);

        detail2.add("Ranchi Rajdhani " + 18020);
        detail2.add("Patna Rajdhani " + 18020);
        detail2.add("Mumbai Rajdhani " + 18020);
        detail2.add("Bhopal Rajdhani " + 18020);
        detail2.add("Mumbai Rajdhani " + 18020);

        System.out.println(detail2);

        System.out.println("----------------------------------");

        System.out.println(detail2.contains("Mumbai Rajdhani " + 18020));

        System.out.println("-----------------------------------");

        for (int i = 0 ; i < detail2.size() ; i++){
            System.out.println(detail2.get(i));
        }

        System.out.println("----------------------------------");

        for (Object object : detail2){
            System.out.println(object + " : Indian Railways ");
        }

        System.out.println("----------------------------------");

        ListIterator listIterator = detail2.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next() + " : NER ");
        }




    }

}
