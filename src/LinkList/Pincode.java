package LinkList;

import java.util.LinkedList;

public class Pincode {
    public static void main(String[] args) {
        LinkedList pincode = new LinkedList();
        pincode.add("Sector 12 : " + 827012);
        pincode.add("Sector 1 : " + 827001);
        pincode.add("Sector 2 : " + 827002);
        pincode.add("Sector 3 : " + 827003);
        pincode.add("Sector 4 : " + 827004);
        System.out.println(pincode);
        System.out.println("---------------");

        System.out.println(pincode.get(0));

        System.out.println("---------------");

        pincode.add(5 , "Sector 5 : " + 827005);
        System.out.println(pincode);

        System.out.println("-----------------");

        pincode.addFirst("Sector 15 : " + 827015);
        System.out.println(pincode);

        System.out.println("-----------------");

        pincode.addLast("Sector 16 : " + 827016);
        System.out.println(pincode);

        System.out.println("-----------------------");

        pincode.removeFirst();
        System.out.println(pincode);

        System.out.println("----------------------");

        pincode.removeLast();
        System.out.println(pincode);

        System.out.println("-------------------------");

        LinkedList pin = new LinkedList();
        pin.add("Sector 6 : " + 827006);
        pin.add("Sector 8 : " + 827008);
        pincode.addAll(pin);
        System.out.println(pincode);


    }
}
