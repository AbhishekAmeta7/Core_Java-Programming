import java.util.*;
public class ArrayDequeImplementation {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayDeque<>();
        c.add(40);
        c.add(60);
        c.add(30);
        System.out.println("Collection: "+c);

        Queue<Character> q = new ArrayDeque<>();
        q.add('A');
        q.add('B');
        q.add('C');
        System.out.println("Queue: "+q);

        Deque<String> dq = new ArrayDeque<>();
        dq.add("Jack");
        dq.add("Cherry");
        dq.add("Alice");
        System.out.println("Deque: "+dq);

        AbstractCollection ac = new ArrayDeque<>();
        ac.add("Hello");
        ac.add("Hii");
        ac.add(true);
        ac.add('A');
        ac.add(70);
        System.out.println("AbstractCollection: "+ac);
        
    }
}
