package Collection.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class FlatNo {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1001);
        list1.add(1002);
        list1.add(1003);
        list1.add(1004);
        list1.add(1005);
        System.out.println(list1);

        System.out.println("------------------------");

        list1.add(2 , 1000);
        System.out.println(list1);

        System.out.println("-------------------------");

        ArrayList<Integer> list2 = new ArrayList<>(5);
        list2.add(2001);
        list2.add(2002);
        list2.add(2003);
        list2.add(2004);
        list2.add(2005);
        System.out.println(list2);

        System.out.println("-------------------------");

        ArrayList<Integer> list3 = new ArrayList<>(list1);
        list3.add(3001);
        list3.add(3002);
        list3.add(3003);
        list3.add(3004);
        list3.add(3005);
        System.out.println(list3);

        System.out.println("------------------------");

        for (int i = 0 ; i < list3.size() ; i++){
            System.out.println(list3.get(i) + " (For loop) ");
        }

        System.out.println("-----------------------");

        for (Integer each : list3){
            System.out.println(each + " (Each loop)");
        }

        System.out.println("---------------------");

        Iterator itrlist = list3.iterator();
        while (itrlist.hasNext()){
            System.out.println(itrlist.next() + " (Iterator)");
        }



    }
}
