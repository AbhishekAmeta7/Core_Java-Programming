import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            al.add(x);
        }
        System.out.println("Before Sorting");
        for (Integer i : al) {
            System.out.print(i+" ");
        }
        Collections.sort(al);
        System.out.println("\nAfter Sorting");
        for (Integer i : al) {
            System.out.print(i+" ");
        }

    }
}
