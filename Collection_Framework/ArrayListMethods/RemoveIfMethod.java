import java.util.ArrayList;
import java.util.Scanner;

public class RemoveIfMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            al.add(x);
        }
        al.removeIf(p -> (p%2 != 0));
        for (Integer i : al) {
            System.out.print(i+" ");
        }
    }
}

