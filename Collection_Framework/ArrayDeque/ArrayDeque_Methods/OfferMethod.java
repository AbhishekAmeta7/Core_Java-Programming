import java.util.*;
public class OfferMethod {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(5);
        dq.add(4);
        dq.add(3);
        dq.add(2);
        System.out.println(dq);
        dq.offer(7);
        System.out.println("offer(): "+dq);
    }
}
