import java.util.*;
public class PriorityQueueInsert {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(5);
        pq.add(7);
        pq.add(3);
        pq.add(2);
        pq.add(4);

        System.out.println(pq);
    }
}