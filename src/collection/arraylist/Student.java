package collection.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Student {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList();
        list1.add("Prakash");
        list1.add("Vikram");
        list1.add("Mritunjay");
        list1.add("Ravi Gupta");
        list1.add("Deepak");
       // System.out.println(list1);

        System.out.println("----------------------------");

        ArrayList list2 = new ArrayList(5);
        list2.add("Shivdutt");
        list2.add("Indrajeet");
        list2.add("Ranjeet");
        list2.add("Mahesh");
        list2.add("Shivkumar");
      //  System.out.println(list2);

        System.out.println("-------------------------------");

        ArrayList list3 = new ArrayList();
        list3.add("Sandeep");
        list3.add("Hemant");
     //   System.out.println(list3);
        ArrayList list4 = new ArrayList(list3);
        list4.add("Rahul Sharma");
        list4.add("Anmol");
        list4.add("Nitish");
//        System.out.println(list4);
//
//        System.out.println(list1.get(1));
//        System.out.println(list1.contains("Prakash"));

        ArrayList<String> names = new ArrayList<>();
        names.add("Prakash");
        names.add("Vikram");
        names.add("Mritunjay");
        for(int i = 0; i < list1.size(); i++){
          //  System.out.println(list1.get(i).toLowerCase());
        }

        for(String s : names){
          //  System.out.println(s + "BIV");
        }

        ListIterator<String> listIterator = names.listIterator();
//        System.out.println(listIterator.next());
//        System.out.println(listIterator.next());
//        System.out.println(listIterator.next());
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
