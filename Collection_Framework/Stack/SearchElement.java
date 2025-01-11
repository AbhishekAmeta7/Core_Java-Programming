import java.util.*;
public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Stack: ");
        int n = sc.nextInt();
        Stack<String> s = new Stack<>();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter String"+i+": ");
            String str = sc.next();
            s.push(str);
        }
        System.out.print("Enter Search Element: ");
        String x = sc.next();
        if(s.contains(x)){
            System.out.print(x+" is Present at "+s.search(x)+"th Index");
        }
        else {
            System.out.println(x+" is Not Present");
        }
    }
}
