import java.util.*;
public class PeekMethod {
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
        
        System.out.println("peek(): "+ad.peek());
        System.out.println("peekFirst(): "+ad.peekFirst());
        System.out.println("peekFirst(): "+ad.peekLast());
    }   
}
