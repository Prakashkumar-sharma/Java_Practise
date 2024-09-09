package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Listex3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1000);
        list.add(2000);
        list.add(3000);
        list.add(4000);
        list.add(5000);
        list.add(6000);
        list.add(7000);
        System.out.println(list);

        for (int i = 0 ; i < list.size() ; i++){
            System.out.println("For list : " + list.get(i));
        }

        System.out.println();

        for(Integer element : list){
            System.out.println("Each list : " + element);
        }

        System.out.println();

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println("Iterator : " + itr.next());
        }

    }
}
