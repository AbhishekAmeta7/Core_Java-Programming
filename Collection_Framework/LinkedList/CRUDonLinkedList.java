import java.util.*;
public class CRUDonLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ll.add(x);
        }

        System.out.println(ll);
        System.out.println("Update An Element");
        ll.set(2, 50);
        System.out.println(ll);
        System.out.println("Delete Element");
        ll.remove(1);
        System.out.println(ll);

    }
}
