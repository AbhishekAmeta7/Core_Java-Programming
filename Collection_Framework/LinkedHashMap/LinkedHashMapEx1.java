import java.util.LinkedHashMap;

public class LinkedHashMapEx1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Character> lhm = new LinkedHashMap<>();
        lhm.put(1, 'A');
        lhm.put(2, 'B');
        lhm.put(3, 'C');
        lhm.put(4, 'D');
        lhm.put(5, 'E');
        System.out.println(lhm.keySet()+"\n"+lhm.values());
        System.out.println(lhm.entrySet());

    }
}
// single key and value and entry set