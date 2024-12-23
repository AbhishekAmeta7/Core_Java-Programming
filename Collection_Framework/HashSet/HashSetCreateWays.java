import java.util.*;

public class HashSetCreateWays {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        System.out.println("Create HashSet Using Set");
        System.out.println(s);
        Collection<Character> c = new HashSet<>();
        c.add('A');
        c.add('B');
        c.add('C');
        c.add('D');
        Iterator it = c.iterator();
        System.out.println("Create HashSet Using Collection");
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println("\nCreate HashSet Using Iterable");
        Iterable itr = new HashSet<>();
        //itr.add(4)--> Not Possible , Iterable Interface Doesn't Support add() 

    }
}
