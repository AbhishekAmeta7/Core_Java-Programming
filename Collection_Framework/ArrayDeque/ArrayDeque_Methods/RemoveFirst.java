import java.util.*;
public class RemoveFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of ArrayDeque: ");
        int n = sc.nextInt();
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            int s= sc.nextInt();
            ad.add(s);
        }
        for (Integer s : ad) {
            System.out.print(s+" ");
        }
        System.out.println();
        ad.removeFirst();
        for (Integer i : ad) {
            System.out.print(i+" ");
        }
    }
}
