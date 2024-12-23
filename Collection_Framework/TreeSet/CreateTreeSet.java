import java.util.*;
public class CreateTreeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of ");
        int n = sc.nextInt();
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ts.add(x);
        }
        System.out.println(ts);
        for (Integer integer : ts) {
            System.out.print(integer+" ");
        }
        System.out.println();
        Iterator itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
}