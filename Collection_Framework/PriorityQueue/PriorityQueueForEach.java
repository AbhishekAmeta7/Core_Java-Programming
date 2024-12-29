import java.util.PriorityQueue;

public class PriorityQueueForEach {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        for(Integer i : pq) {
            System.out.print(i+" ");
        }
    }
}
