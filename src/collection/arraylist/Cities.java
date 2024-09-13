package collection.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Cities {
    public static void main(String[] args) {
        ArrayList<String> places = new ArrayList();
        places.add("Delhi");
        places.add("Mumbai");
        places.add("Kolkata");
        places.add("Chennai");
        places.add("Bengluru");
        places.add("Hyderabad");
        places.add("Trivendrapuram");
        places.add("Bhopal");
        places.add("Raipur");
        places.add("Gandhinagar");
        System.out.println(places);

        System.out.println(places.get(6));

        System.out.println(places.remove(7));

        System.out.println(places);

        places.add(8 , "Chandigarh");
        System.out.println(places);

        places.set(5 , "Lucknow");
        System.out.println(places);

        System.out.println(places.size());

        ArrayList<String>  places2 = new ArrayList();
        places2.add("Srinagar");
        places2.add("Aizwal");
        places2.add("Imphal");
        places2.add("Shillong");
        places2.add("Agartala");
        places2.add("Imphal");
        places2.add("Itanagar");


        System.out.println(places2);
        places.addAll(places2);
        System.out.println(places);

        System.out.println( places2.contains("Imphal"));

        System.out.println( places.contains("Imphal"));



        System.out.println(places2.indexOf("Imphal"));

        System.out.println("----------------------------");

        for(int i = 0 ; i < places.size() ; i++){
            System.out.println(places.get(i));
        }

        System.out.println("-------------------------------");

        for (String s : places){
            System.out.println(s + " : City in India");
        }

        System.out.println("-------------------------------");

        ListIterator<String> listIterator = places.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }





    }
}
