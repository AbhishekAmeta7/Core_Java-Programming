import java.util.*;

public class RemoveRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Vector: ");
        int n = sc.nextInt();
        Vector<String> v = new Vector<>();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter String " + i + ": ");
            String s = sc.next();
            v.add(s);
        }
        System.out.println("Vector: " + v);
        System.out.print("Enter Start Range (inclusive): ");
        int x = sc.nextInt();
        System.out.print("Enter End Range (exclusive): ");
        int y = sc.nextInt();

        try {
            if (x < 0 || y > v.size() || x >= y) {
                throw new IllegalArgumentException("Invalid range!");
            }
            for (int i = y - 1; i >= x; i--) {
                v.remove(i);
            }

            System.out.println("Vector after removal: " + v);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
