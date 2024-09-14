package LinkList;

import java.util.LinkedList;

public class TrainNumber {
    public static void main(String[] args) {
        LinkedList<Integer> train = new LinkedList();
        train.add(12826);
        train.add(12030);
        train.add(18060);
        train.add(12830);
        train.add(18123);
        System.out.println(train);

        System.out.println("--------------------");

        train.addFirst(18030);
        System.out.println(train);

        System.out.println("---------------------");

        train.addLast(12190);
        System.out.println(train);

        System.out.println("-----------------------");

        train.removeFirst();
        System.out.println(train);

        System.out.println("------------------------");

        train.removeLast();
        System.out.println(train);

        System.out.println("---------------------------");

        System.out.println(train.getFirst());

        System.out.println("--------------------------");

        System.out.println(train.getLast());

    }
}
