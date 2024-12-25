import java.util.*;
public class LinkedHashMapForeach {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Character> lhm = new LinkedHashMap<>();
        lhm.put(1, 'A');
        lhm.put(2, 'B');
        lhm.put(3, 'C');
        lhm.put(4, 'D');
        lhm.put(5, 'E');

        Set<Map.Entry<Integer,Character>> set = lhm.entrySet();
        for(Map.Entry<Integer,Character> map : set) {
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }
}
