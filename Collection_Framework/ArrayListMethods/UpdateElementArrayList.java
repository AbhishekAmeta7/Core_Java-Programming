import java.util.ArrayList;

public class UpdateElementArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println("Before Update");
        for (Integer i : al) {
            System.out.print(i+" ");
        }
        al.set(1, 70);
        al.set(3, 90);
        System.out.println("\nAfter Update");
        for (Integer i : al) {
            System.out.print(i+" ");
        }
    }
}
