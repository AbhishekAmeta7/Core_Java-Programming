import java.util.*;
public class Map_putAll {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<>();
        m1.put(1,"Apple");
        m1.put(2,"Banana");
        m1.put(3,"Cherry");

        Map<Integer,String> m2 = new HashMap<>();
        m2.put(6,"Mango");
        m2.put(7,"Graps");
        m2.put(5,"Orange");
        m1.putAll(m2);
        System.out.println("Key   "+" Value");
        for (Map.Entry<Integer,String> map : m1.entrySet()) {
            System.out.println(map.getKey()+"      "+map.getValue());
        }

    }
}