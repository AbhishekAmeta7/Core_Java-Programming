import java.util.*;
public class TreeMapForEach {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(1, "Java");
        tm.put(2, "Python");
        tm.put(3, "C");
        tm.put(4, "Kotlin");
        tm.put(5, "C++");

        Set<Map.Entry<Integer , String>> set = tm.entrySet();
        for (Map.Entry<Integer,String> entry : set) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
