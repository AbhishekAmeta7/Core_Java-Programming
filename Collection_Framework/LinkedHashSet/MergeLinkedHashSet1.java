import java.util.*;

public class MergeLinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(4);
        lhs.add(5);
        lhs.add(6);
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(3);
        al.add(4);
        lhs.addAll(al);
        System.out.println(lhs);

        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(5);
        al1.add(6);
        al1.add(7);
        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
        lhs1.add(5);
        lhs1.add(8);
        lhs1.add(9);
        al1.addAll(lhs1);
        System.out.println(al1);



        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();
        lhs.add(4);
        lhs.add(5);
        lhs.add(6);
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(2);
        ll.add(3);
        ll.add(4);
        lhs.addAll(ll);
        System.out.println(lhs);

        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(5);
        ll1.add(6);
        ll1.add(7);
        LinkedHashSet<Integer> lhs3 = new LinkedHashSet<>();
        lhs3.add(5);
        lhs3.add(8);
        lhs3.add(9);
        ll1.addAll(lhs3);
        System.out.println(ll1);

    }
}
