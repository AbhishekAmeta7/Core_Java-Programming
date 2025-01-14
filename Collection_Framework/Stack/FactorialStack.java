import java.util.*;
public class FactorialStack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Stack: ");
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            stack.push(x);
        }
        List<Long> l = new ArrayList<>();
        for (Integer i : stack) {
            long fact = 1;
            while (i>0) {
                fact = fact*i;
                i--;
            }
            l.add(fact);
        }
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
}