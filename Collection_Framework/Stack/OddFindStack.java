import java.util.*;
public class OddFindStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Stack: ");
        int n = sc.nextInt();
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            s.push(x);
        }
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i)%2 != 0) {
                System.out.print(s.get(i)+" ");
            }
        }
    }
}
