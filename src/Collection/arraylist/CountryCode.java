package collection.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class CountryCode {
    public static void main(String[] args) {
        ArrayList country = new ArrayList(15);
        country.add("India : " + 91);
        country.add("USA : " + 340);
        country.add("Bangladesh : " + 880);
        country.add("China : " + 86);
        country.add("Germany : " + 49);
        System.out.println(country);

        System.out.println("------------------");

        country.add(2 , "Greece : " + 30);
        System.out.println(country);

        System.out.println("---------------------");

        country.set(3 , "Indonesia : " + 62);
        System.out.println(country);

        System.out.println("----------------------");

        System.out.println(country.get(3));

        System.out.println("-----------------------");

        ArrayList code = new ArrayList(5);
        code.add("Maldives : " + 960);
        code.add("Mexico : " + 52);
        code.add("Netherlands : " + 31);
        code.add("Russia : " + 7);

        country.addAll(code);
        System.out.println(country);

        System.out.println("-----------------------");

        System.out.println(country.size());

        System.out.println("--------------------------");

        for (int i = 0 ; i < country.size() ; i++){
            System.out.println(country.get(i));
        }

        System.out.println("---------------------------");

      for(Object object  : country){
          System.out.println(object + " : Dial code");

      }

        System.out.println("------------------------------");

        ListIterator listIterator = country.listIterator();
          while (listIterator.hasNext()){
              System.out.println(listIterator.next());
          }
        }




    }

