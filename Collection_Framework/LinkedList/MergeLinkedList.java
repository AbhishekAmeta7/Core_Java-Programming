import java.util.*;
public class MergeLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of 1st LinkedList: ");
        int n1 = sc.nextInt();
        LinkedList<String> ll1 = new LinkedList<>();
        for (int i = 0; i < n1; i++) {
            String s = sc.next();
            ll1.add(s);
        }
        System.out.print("Enter Size Of 2nd LinkedList: ");
        int n2 = sc.nextInt();
        LinkedList<String> ll2 = new LinkedList<>(ll1);
        for (int i = 0; i < n2; i++) {
            String s = sc.next();
            ll2.add(s);
        }
        System.out.println(ll2);

        System.out.print("Enter Size Of 3rd LinkedList: ");
        int n3 = sc.nextInt();
        LinkedList<String> ll3 = new LinkedList<>();
        for (int i = 0; i < n3; i++) {
            String s = sc.next();
            ll3.add(s);
        }
        System.out.print("Enter Size Of 4th LinkedList: ");
        int n4 = sc.nextInt();
        LinkedList<String> ll4 = new LinkedList<>();
        for (int i = 0; i < n4; i++) {
            String s = sc.next();
            ll4.add(s);
        }
        ll3.addAll(ll4);
        System.out.println(ll3);


    }
}