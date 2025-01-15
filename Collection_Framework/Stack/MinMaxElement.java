import java.util.*;
public class MinMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Stack: ");
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            stack.push(x);
        }
        int max = stack.get(0);
        int min = stack.get(0);
        for (int i = 0; i < stack.size(); i++) {
            if(stack.get(i)<min) {
                min = stack.get(i);
            }
            else {
                max = stack.get(i);
            }
        }
        System.out.println("Maximum Element: "+max);
        System.out.println("Minimum Element: "+min);
    }
}
