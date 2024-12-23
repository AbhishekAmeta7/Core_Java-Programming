import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(50);
        al.add(90);
        al.add(30);
        al.add(40);
        al.add(70);
        al.add(60);
        al.add(100);
        System.out.println("Before Remove");
        for (Integer i : al) {
            System.out.print(i+" ");
        }
        al.remove(1);
        al.remove(2);
        System.out.println("\nAfter Remove Element");
        for (Integer i : al) {
            System.out.print(i+" ");
        }

    }
}
