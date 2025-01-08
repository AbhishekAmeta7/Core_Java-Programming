import java.util.*;
public class AddLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of ArrayDeque: ");
        int n = sc.nextInt();
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ad.add(x);
        }
        System.out.println(ad);
        ad.addLast(50);
        System.out.println("Add Last: "+ad);
    }
}
