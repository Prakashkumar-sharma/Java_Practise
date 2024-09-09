package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Prioritylistex2 {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(20);
        pq.offer(10);
        pq.offer(30);
        pq.offer(50);
        pq.offer(40);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
