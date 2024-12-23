import java.util.*;
public class PrintLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of LinkedList: ");
        int n = sc.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ll.add(x);
        }
        ListIterator li = ll.listIterator();
        System.out.println("Print LinkedList Forward Direction");
        while (li.hasNext()) {
            System.out.print(li.next()+" ");
        }
        System.out.print("\nPrint LinkedList Backward Direction\n");
        while (li.hasPrevious()) {
            System.out.print(li.previous()+" ");
        }
    }
}