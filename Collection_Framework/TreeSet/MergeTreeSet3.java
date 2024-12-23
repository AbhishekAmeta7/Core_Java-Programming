import java.util.*;
public class MergeTreeSet3 {
    public static void main(String[] args) {
        System.out.println("TreeSet <---> LinkedHashSet");
        TreeSet<Integer> ts1 = new TreeSet<>();
        ts1.add(9);
        ts1.add(5);
        ts1.add(7);
        ts1.add(10);
        ts1.add(6);
        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
        lhs1.add(7);
        lhs1.add(6);
        lhs1.add(3);
        ts1.addAll(lhs1);
        System.out.println(ts1);

        System.out.println("LinkedHashSet <---> TreeSet");
        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();
        lhs2.add(7);
        lhs2.add(6);
        lhs2.add(3);
        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(9);
        ts2.add(5);
        ts2.add(7);
        ts2.add(10);
        ts2.add(6);
        lhs2.addAll(ts2);
        System.out.println(lhs2);


    }
}