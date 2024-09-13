package collection.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Employee {
    public static void main(String[] args) {
        ArrayList emp = new ArrayList();
        emp.add("Abhimanyu" +  " IT "  + 12345);
        emp.add("Rajan" +   " Network-Security " +  54321);
        emp.add("Abhijeet" +  " Management "  + 56789);
        emp.add("Rahul" +  " Digital-marketing " + 74839);
        emp.add("Prateek"  +  " Banking "  + 34857);
        emp.add("Abhijeet" +  " Management "  + 56789);

        System.out.println(emp);

        System.out.println("---------------------------");

        System.out.println(emp.size());

        System.out.println("----------------------------");


        emp.set(4 , "Nitish" +  " Teaching "  + 67584);
        System.out.println(emp);

        System.out.println("--------------------------");

        ArrayList emp2 = new ArrayList();
        emp2.add("Ajay" + " IT " + 45683);
        emp2.add("Shudhanshu" + " Media " + 83456);

        emp.addAll(emp2);
        System.out.println(emp);

        for (int i = 0 ; i < emp.size() ; i++){
            System.out.println(emp.get(i));
        }

        System.out.println("------------------------");

        for(Object object : emp){
            System.out.println(object + " Employee detail ");
        }

        System.out.println("----------------------------");

        ListIterator listIterator = emp.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }








    }
}
