package Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Prioritylistex1 {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
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
