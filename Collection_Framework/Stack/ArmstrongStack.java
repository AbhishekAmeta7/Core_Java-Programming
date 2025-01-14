import java.util.*;
public class ArmstrongStack {
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
            int ans = 0,temp = s.get(i);
            while(temp>0) {
                int a = temp%10;
                ans = ans+a*a*a;
                temp /= 10;
            }
            if(s.get(i)==ans){
                System.out.print(ans+" ");
            }
        }
    }
}
