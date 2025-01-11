import java.util.*;

public class CopyIntoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Vector: ");
        int n = sc.nextInt();
        Stack<String> s = new Stack<>();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter String " + i + ": ");
            String str = sc.next();
            s.add(str);
        }
        System.out.println("Stack: " + s);
        String[] arr = new String[s.size()];
        s.copyInto(arr); 
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
