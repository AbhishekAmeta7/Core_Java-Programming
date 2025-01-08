import java.util.*;
public class OfferFirstOfferLast {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("Python");
        dq.add("C");
        dq.add("C++");
        dq.add("C++");
        System.out.println(dq);
        dq.offerFirst("Java");
        System.out.println("add first: "+dq);
        dq.offerLast("Kotlin");
        System.out.println("add last: "+dq);
    }
}
