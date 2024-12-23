import java.util.*;

public class LinkedHashSetCreationWay {
    public static void main(String[] args) {
        Iterable it = new LinkedHashSet<>();
        Collection<Integer> c = new LinkedHashSet<>();
        c.add(3);
        c.add(6);
        System.out.println(c);
        Set<Character> s = new LinkedHashSet<>();
        s.add('A');
        s.add('B');
        s.add('C');
        s.add('C');
        s.add(' ');
        s.add(' ');
        System.out.println(s);

    }
}
