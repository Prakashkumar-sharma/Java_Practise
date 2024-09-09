package Collection;

import java.util.ArrayList;
import java.util.List;

public class Listex2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);
        list.add(600);
        System.out.println(list);
        list.add(2, 250);
        System.out.println(list);


        List<Integer> newList = new ArrayList();
        newList.add(700);
        newList.add(800);
        newList.add(900);
        newList.add(1000);

        list.addAll(newList);
        System.out.println(list);

        list.set(2, 2000);
        System.out.println(list);


        System.out.println(list.contains(2000));

        list.remove(2);
        System.out.println(list);

        list.remove(Integer.valueOf(800));
        System.out.println(list);

       // list.clear();
       // System.out.println(list);
    }
}
