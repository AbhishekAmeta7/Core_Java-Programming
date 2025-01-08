import java.util.ArrayDeque;
import java.util.Scanner;

public class PollLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of ArrayDeque: ");
        int n = sc.nextInt();
        ArrayDeque<String> ad = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Srting"+i+": ");
            String s= sc.next();
            ad.add(s);
        }
        for (String s : ad) {
            System.out.print(s+" ");
        }
        System.out.println();
        ad.pollLast();
        for (String s : ad) {
            System.out.print(s+" ");
        }
    }   
}
