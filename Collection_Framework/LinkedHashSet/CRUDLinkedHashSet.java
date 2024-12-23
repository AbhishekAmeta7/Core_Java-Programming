import java.util.*;
public class CRUDLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(4);
        lhs.add(3);
        lhs.add(6);
        lhs.add(5);
        System.out.println(lhs);
        System.out.println("--After Remove--");
        lhs.remove(4);
        System.out.println(lhs);
    }
}
