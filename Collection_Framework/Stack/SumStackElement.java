import java.util.Scanner;
import java.util.Stack;

public class SumStackElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Stack: ");
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            stack.push(x);
        }
        int sum = 0;
        for (Integer i : stack) {
            sum += i;
        }
        System.out.println("Sum Of Stack Elements: "+sum);
    }
}
