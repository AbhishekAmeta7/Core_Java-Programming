import java.util.*;
public class getFirstGetLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of ArrayDeque: ");
        int n = sc.nextInt();
        ArrayDeque<String> ad = new ArrayDeque<>();
        for(int i = 1; i <= n; i++) {
            System.out.print("Enter String"+i+": ");
            String s = sc.next();
            ad.add(s);
        } 
        System.out.println(ad);
        System.out.println("First Element: "+ad.getFirst());
        System.out.println("Last Element: "+ad.getLast());
    }
}
