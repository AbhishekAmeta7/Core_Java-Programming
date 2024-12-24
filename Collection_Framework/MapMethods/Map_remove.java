import java.util.*;
public class Map_remove {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(26, "Alice");
        hm.put(23, "Charlie");
        hm.put(27, "Bob");
        hm.put(20, "John");
        
        Set set=hm.entrySet();
        Iterator itr = set.iterator();
        System.out.println("Age  "+"  Name");
        while (itr.hasNext()) {
            Map.Entry e=(Map.Entry)itr.next();
            System.out.println(e.getKey()+"     "+e.getValue());
            
        }
        System.out.println();
        hm.remove(27,"Bob");
        System.out.println("Age  "+"  Name");
        Set s = hm.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()) {
            Map.Entry e=(Map.Entry)it.next();
            System.out.println(e.getKey()+"     "+e.getValue());
            
        }
    }
}
