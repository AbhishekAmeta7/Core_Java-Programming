import java.util.*;
public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Stack: ");
        int n = sc.nextInt();
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            s.push(x);
        }
        int count = 0;
        for (int i = 0; i < s.size(); i++) {
            for (int j = i+1; j < s.size(); j++) {
                if (s.get(i).equals(s.get(j))) {
                    count++;
                   System.out.print(s.get(i)+" ");
                }
            }
        }
        System.out.print("\nNo. Of Duplicate Elements: "+count);
    }
}
