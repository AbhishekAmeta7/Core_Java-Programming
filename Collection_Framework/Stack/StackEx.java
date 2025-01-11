import java.util.*;
public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(12);
        s.push(34);
        s.push(56);
        s.push(78);
        s.push(90);
        Iterator itr = s.iterator();
        System.out.println("Print Using Iterator: ");
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.println("\nPrint Using Foreach");
        for (Integer i : s) {
            System.out.print(i+" ");
        }
    }
}