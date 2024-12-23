import java.util.*;
public class LinkedHashSetEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of LinkedHashSet: ");
        int n = sc.nextInt();
        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
        System.out.println("Enter Integer Element: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            lhs1.add(x);
        }
        System.out.println(lhs1);
        for (Integer i : lhs1) {
            System.out.print(i+" ");
        }
        System.out.println();
        Iterator itr = lhs1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }

        System.out.print("\nEnter Size Of LinkedHashSet: ");
        int n1 = sc.nextInt();
        LinkedHashSet<String> lhs2 = new LinkedHashSet<>();
        System.out.println("Enter String Element: ");
        for (int i = 0; i < n1; i++) {
            String x = sc.next();
            lhs2.add(x);
        }
        System.out.println(lhs2);
        for (String i : lhs2) {
            System.out.print(i+" ");
        }
        System.out.println();
        itr = lhs2.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }

        System.out.print("\nEnter Size Of LinkedHashSet: ");
        int n2 = sc.nextInt();
        LinkedHashSet<Character> lhs3 = new LinkedHashSet<>();
        System.out.println("Enter Character Element: ");
        for (int i = 0; i < n2; i++) {
            char x = sc.next().charAt(0);
            lhs3.add(x);
        }
        System.out.println(lhs3);
        for (Character i : lhs3) {
            System.out.print(i+" ");
        }
        System.out.println();
        itr = lhs3.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }

    }
}