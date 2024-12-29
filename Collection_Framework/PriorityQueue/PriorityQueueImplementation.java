import java.util.*;
public class PriorityQueueImplementation {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        q.add("Java");
        q.add("Python");
        q.add("Linux");
        q.add("MYSQL");
        q.add("React");

        Iterator itr = q.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }

        System.out.println();
        
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
