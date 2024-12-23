import java.util.*;
public class CreateLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of LinkedList: ");
        int n = sc.nextInt();
        LinkedList<String> ll = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            ll.add(s);
        }
        System.out.println(ll);
        System.out.println("Print Linked List Using foreach loop");
        for (String s : ll) {
            System.out.print(s+" ");
        }
        System.out.println("\nPrint Linked List Using for loop");
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i)+" ");
        }
        System.out.println("\nPrint Linked List Using Iterator");
        Iterator itr = ll.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.println("\nPrint forward Linked List Using ListIterator");
        ListIterator litr = ll.listIterator();
        while (litr.hasNext()) {
            System.out.print(litr.next() + " ");
        }
        System.out.println("\nPrint Backward Linked List Using ListIterator");
        while (litr.hasPrevious()) {
            System.out.print(litr.previous()+" ");
        }
    }
}
// linkedlist :
// create :
// print all way :