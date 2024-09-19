package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Population {
    public static void main(String[] args) {
        HashSet population = new HashSet();
        population.add("India : " + 1.5 + " Billion");
        population.add("China : " + 1.4 + " Billion");
        population.add("USA   : " + 0.35 + " Billion");
        population.add("Pakistan : " + 0.25 + " Billion");
        population.add("Bangladesh : " + 0.20 + " Billion");
        System.out.println(population);

        System.out.println("------------------------------");

        System.out.println(population.size());

        System.out.println("------------------------------");

        System.out.println(population.isEmpty());

        System.out.println("-----------------------------");

        System.out.println(population.contains("USA   : " + 0.35 + " Billion"));

        System.out.println("-------------------------------");

        System.out.println(population.clone());

        System.out.println("------------------------------------");

        HashSet citizens = new HashSet(population);
        citizens.add("Russia : " + 0.14 + " Billion");
        citizens.add("Indonesia : " + 0.23 + " Billion");
        System.out.println(citizens);

        System.out.println("-------------------------");

        for(Object object : citizens){
            System.out.println(object);
        }

        System.out.println("---------------------------");

        Iterator noOfPeople = citizens.iterator();
        while (noOfPeople.hasNext()){
            System.out.println(noOfPeople.next());
        }

    }
}
