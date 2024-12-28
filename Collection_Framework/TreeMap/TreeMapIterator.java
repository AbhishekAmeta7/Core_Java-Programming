import java.util.*;
public class TreeMapIterator {
    public static void main(String[] args) {
        TreeMap<Integer,Character> tm = new TreeMap<>();
        tm.put(1, 'A');
        tm.put(2, 'B');
        tm.put(3, 'C');
        tm.put(4, 'D');
        tm.put(5, 'E');

        Set set=tm.entrySet();
        Iterator itr=set.iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer,Character> e = (Map.Entry<Integer,Character>)itr.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
