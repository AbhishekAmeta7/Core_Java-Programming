import java.util.*;
public class MergeArrayListLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of 1st ArrayList: ");
        int n1 = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            int x = sc.nextInt();
            al.add(x);
        }
        System.out.print("Enter Size Of 1st LinkedList: ");
        int n2 = sc.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < n2; i++) {
            int x = sc.nextInt();
            ll.add(x);
        }
        al.addAll(ll);
        for (Integer integer : al) {
            System.out.print(integer+" ");
        }

        System.out.print("\nEnter Size Of 2nd ArrayList: ");
        int n3 = sc.nextInt();
        ArrayList<Integer> al1 = new ArrayList<>();
        for (int i = 0; i < n3; i++) {
            int x = sc.nextInt();
            al1.add(x);
        }
        System.out.print("Enter Size Of 2nd LinkedList: ");
        int n4 = sc.nextInt();
        LinkedList<Integer> ll1 = new LinkedList<>();
        for (int i = 0; i < n4; i++) {
            int x = sc.nextInt();
            ll1.add(x);
        }
        ll1.addAll(al1);
        for (Integer integer : ll1) {
            System.out.print(integer+" ");
        }
    }
}
