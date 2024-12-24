import java.util.*;

public class Map_clear {
    public static void main(String[] args) {
        Map<Character, String> m = new HashMap<>();
        m.put('A', "Apple");
        m.put('B', "Boy");
        m.put('C', "Cat");

        Set<Map.Entry<Character, String>> set = m.entrySet();

        for (Map.Entry<Character, String> map2 : set) {
            System.out.println(map2.getKey() + " " + map2.getValue());
        }
        
        m.clear();
        System.out.println("After Clear");
        System.out.println();
        System.out.println(m);
    }
}
