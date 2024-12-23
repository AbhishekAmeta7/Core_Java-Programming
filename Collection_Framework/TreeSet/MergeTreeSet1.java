import java.util.*;
public class MergeTreeSet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of 1st TreeSet: ");
        int n1 = sc.nextInt();
        TreeSet<String> ts1 = new TreeSet<>();
        for (int i = 0; i < n1; i++) {
            String s = sc.next();
            ts1.add(s);
        }
        System.out.print("Enter Size Of 2nd TreeSet: ");
        int n2 = sc.nextInt();
        TreeSet<String> ts2 = new TreeSet<>();
        for (int i = 0; i < n2; i++) {
            String s = sc.next();
            ts2.add(s);
        }
        ts1.addAll(ts2);
        Iterator itr = ts1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }

        System.out.print("Enter Size Of TreeSet: ");
        int n3 = sc.nextInt();
        TreeSet<String> ts3 = new TreeSet<>();
        for (int i = 0; i < n3; i++) {
            String s = sc.next();
            ts3.add(s);
        }

        System.out.print("Enter Size Of HashSet: ");
        int n4 = sc.nextInt();
        HashSet<String> hs1 = new HashSet<>();
        for (int i = 0; i < n4; i++) {
            String s = sc.next();
            hs1.add(s);
        }
        ts3.addAll(hs1);
        itr = ts3.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }

        System.out.print("Enter Size Of TreeSet: ");
        int n5 = sc.nextInt();
        TreeSet<String> ts4 = new TreeSet<>();
        for (int i = 0; i < n3; i++) {
            String s = sc.next();
            ts3.add(s);
        }

        System.out.print("Enter Size Of HashSet: ");
        int n6 = sc.nextInt();
        HashSet<String> hs2 = new HashSet<>();
        for (int i = 0; i < n6; i++) {
            String s = sc.next();
            hs2.add(s);
        }
        hs2.addAll(ts4);
        itr = hs2.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }

    }
}