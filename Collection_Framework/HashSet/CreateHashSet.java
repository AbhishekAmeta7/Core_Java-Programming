import java.util.*;
public class CreateHashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Java");
        hs.add("Python");
        hs.add("C++");
        hs.add("C");
        hs.add("Kotlin");
        System.out.println(hs);
        System.out.println("Print Using foreach");
        for (String s : hs) {
            System.out.print(s+" ");
        }
        System.out.println("\nPrint Using Iterator");
        Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
}