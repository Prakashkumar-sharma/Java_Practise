package LinkList;

import java.util.LinkedList;

public class FlatDetails {
    public static void main(String[] args) {
        LinkedList detail = new LinkedList();
        detail.add("Mr. Sharma");
        detail.add(1001);
        detail.add(null);
        detail.add("Mr. Singh");
        detail.add(1002);
        detail.add(null);
        detail.add("Mr. Yadav");
        detail.add(1003);
        detail.add(null);
        detail.add("Mr. Gupta");
        detail.add(1004);
        System.out.println(detail);

        System.out.println("----------------");

        detail.addFirst(null);
        detail.addFirst(1000);
        detail.addFirst("Mr. Mandal");
        System.out.println(detail);

        System.out.println("-----------------");

        LinkedList details = new LinkedList(detail);
        detail.add("Mr. Dwivedi");
        detail.add(1005);
        detail.add(null);
        detail.add("Mr. Mahto");
        detail.add(1006);
        detail.add(null);
        System.out.println(detail);

        System.out.println("-----------------------");

        detail.addLast(null);
        detail.addLast(1007);
        detail.addLast("Mr. Prasad");
        System.out.println(detail);







    }
}
