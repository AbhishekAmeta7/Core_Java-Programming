import java.util.*;
public class TreeMapInsert {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(1, "Java");
        tm.put(2, "Python");
        tm.put(3, "C");
        tm.put(4, "Kotlin");
        tm.put(5, "C++");

        System.out.println(tm);

        System.out.println(tm.keySet());
        System.out.println(tm.values());
    }
}