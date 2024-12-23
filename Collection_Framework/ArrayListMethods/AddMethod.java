import java.util.*;
public class AddMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of ArrayList:");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            al.add(x);
        } 
        for (Integer integer : al) {
            System.out.print(integer+" ");
        }
    }
}