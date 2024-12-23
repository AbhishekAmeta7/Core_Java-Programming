import java.util.*;
public class MergeTreeSet2 {
    public static void main(String[] args) {
        System.out.println("ArrayList <---> TreeList");
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(1);
        al1.add(3);
        al1.add(5);
        al1.add(4);
        al1.add(3);
        TreeSet<Integer> ts1 = new TreeSet<>();
        ts1.add(5);
        ts1.add(1);
        ts1.add(9);
        ts1.add(6);
        al1.addAll(ts1);
        System.out.println(al1);

        System.out.println("TreeSet <---> ArrayList");
        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(5);
        ts2.add(1);
        ts2.add(9);
        ts2.add(6);
        ts2.addAll(ts2);
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(1);
        al2.add(3);
        al2.add(5);
        al2.add(4);
        al2.add(3);
        ts2.addAll(al2);
        System.out.println(ts2);

        System.out.println("LinkedList <---> TreeList");
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(1);
        ll1.add(3);
        ll1.add(5);
        ll1.add(4);
        ll1.add(3);
        TreeSet<Integer> ts3 = new TreeSet<>();
        ts3.add(5);
        ts3.add(1);
        ts3.add(9);
        ts3.add(6);
        ll1.addAll(ts3);
        System.out.println(ll1);

        System.out.println("TreeSet <---> LinkedList");
        TreeSet<Integer> ts4 = new TreeSet<>();
        ts4.add(5);
        ts4.add(1);
        ts4.add(9);
        ts4.add(6);
        LinkedList<Integer> ll2 = new LinkedList<>();
        ll2.add(1);
        ll2.add(3);
        ll2.add(5);
        ll2.add(4);
        ll2.add(3);
        ts4.addAll(ll2);
        System.out.println(ts4);
    }
}

