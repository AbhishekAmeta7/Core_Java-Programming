import java.util.*;
public class LinkedHashMapHomugeneous {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Character> lhm = new LinkedHashMap<>();
        lhm.put(1, 'A');
        lhm.put(2, 'B');
        lhm.put(3, 'C');
        lhm.put(4, 'D');
        lhm.put(5, 'E');

        Set<Map.Entry<Integer,Character>> en = lhm.entrySet();
        for (Map.Entry<Integer,Character> entry : en) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
