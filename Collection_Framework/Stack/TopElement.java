import java.util.*;
public class TopElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Stack: ");
        int n = sc.nextInt();
        Stack<String> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            s.push(str);
        }
        System.out.println(s);
        System.out.println("Top Element: "+s.peek());
    }
}
