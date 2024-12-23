import java.util.*;
public class MergeHashSet {
    public static void main(String[] args) {
        System.out.println("HashSet ---> HashSet");
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(2);
        hs1.add(1);
        hs1.add(3);
        hs1.add(5);
        hs1.add(4);
        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(1);
        hs2.add(2);
        hs2.add(3);
        hs2.add(7);
        hs1.addAll(hs2);
        System.out.println(hs1);

        System.out.println("HashSet ---> ArrayList");
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(2);
        al1.add(3);
        al1.add(6);
        al1.add(5);
        HashSet<Integer> hs3 = new HashSet<>(al1);
        hs3.add(3);
        hs3.add(6);
        hs3.add(1);
        System.out.println(hs3);

        System.out.println("ArrayList ---> HashSet");

        HashSet<Integer> hs4 = new HashSet<>();
        hs4.add(3);
        hs4.add(6);
        hs4.add(1);
        ArrayList<Integer> al2 = new ArrayList<>(hs4);
        al2.add(4);
        al2.add(5);
        al2.add(6);
        al2.add(7);
        al2.add(8);
        System.out.println(al2);

        System.out.println("HashSet ---> LinkedList");

        LinkedList<Character> ll1 = new LinkedList<>();
        ll1.add('a');
        ll1.add('b');
        ll1.add('c');
        ll1.add('e');
        HashSet<Character> hs5 = new HashSet<>();
        hs5.add('c');
        hs5.add('d');
        hs5.add('r');
        hs5.add('y');
        hs5.add('f');
        hs5.addAll(ll1);
        System.out.println(hs5);

        System.out.println("LinkedList ---> HashSet");
        
        HashSet<Character> hs6 = new HashSet<>();
        hs6.add('a');
        hs6.add('c');
        hs6.add('b');
        LinkedList<Character> ll2 = new LinkedList<>(hs6);
        ll2.add('a');
        ll2.add('b');
        ll2.add('d');
        System.out.println(ll2);
        
    }
}
