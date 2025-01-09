import java.util.*;
public class AddVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Vector: ");
        int n = sc.nextInt();
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            v.addElement(x);
        }
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i)+" ");
        }
    }
}