import java.util.*;
public class UniqueStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Stack: ");
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            stack.push(x);
        }
        for (int i = 0; i < stack.size(); i++) {
            for (int j = i+1; j < stack.size(); j++) {
                if(stack.get(i).equals(stack.get(j))) {
                    stack.set(i,0 );
                    stack.set(j,0 );
                }
            }
            if(stack.get(i) > 0) {
                System.out.print(stack.get(i)+" ");
            }
        }
    }
}
