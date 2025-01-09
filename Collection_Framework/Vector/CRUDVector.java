import java.util.*;
public class CRUDVector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("C");
        v.add("C++");
        v.add("Kotlin");
        v.add("Python");
        v.add("MySQL");

        for (String s : v) {
            System.out.print(s+" ");
        }
        System.out.println();
        v.set(0, "Java");
        for (String s : v) {
            System.out.print(s+" ");
        }
        System.out.println();
        v.remove(1);
        System.out.println(v);
    }
}
