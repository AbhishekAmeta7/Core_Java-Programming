import java.util.*;
class AddFirst {
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
        ad.addFirst(7);
        System.out.println("Add First: "+ad);
    }
}