import java.util.*;
public class MergeLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
        lhs1.add(1);
        lhs1.add(2);
        lhs1.add(3);
        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>(lhs1);
        lhs2.add(6);
        lhs2.add(5);
        lhs2.add(4);
        System.out.println(lhs2);

        LinkedHashSet<Integer> lhs3 = new LinkedHashSet<>();
        lhs3.add(5);
        lhs3.add(4);
        lhs3.add(9);
        HashSet hs1 = new HashSet<>();
        hs1.add(4);
        hs1.add(6);
        hs1.add(7);
        lhs3.addAll(hs1);
        System.out.println(lhs3);

        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(6);
        hs2.add(7);
        hs2.add(8);
        LinkedHashSet<Integer> lhs4 = new LinkedHashSet<>();
        lhs4.add(6);
        lhs4.add(5);
        lhs4.add(4);
        hs2.addAll(lhs4);
        System.out.println(hs2);

    }
}
