import java.util.*;
public class LinkedHashMapHierarchy {
    public static void main(String[] args) {
        Map<Integer,String> m = new LinkedHashMap<>();

        m.put(1, "AA");
        m.put(2, "BB");
        m.put(3, "CC");
        m.put(4, "DD");
        m.put(5, "EE");

        Set<Map.Entry<Integer,String>> set = m.entrySet();
        for(Map.Entry<Integer,String> map : set) {
            System.out.println(map.getKey()+" "+map.getValue());
        }

        System.out.println("---------------x(\"---------------");
        LinkedHashMap<Integer,Character> lhm = new LinkedHashMap<>();
        lhm.put(1, 'A');
        lhm.put(2, 'B');
        lhm.put(3, 'C');
        lhm.put(4, 'D');
        lhm.put(5, 'E');

        Set<Map.Entry<Integer,Character>> set1 = lhm.entrySet();
        for(Map.Entry<Integer,Character> map : set1) {
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }
}
