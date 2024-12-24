import java.util.HashMap;
import java.util.Map;

public class HashMapNull {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1, "Java");
        hm.put(2, "Python");
        hm.put(3, "C");
        hm.put(null, "C++");
        hm.put(null, "Kotlin");
        hm.put(5, null);
        hm.put(4, null);
        hm.put(6, "SQL");

        for (Map.Entry element : hm.entrySet()) {
            System.out.println(element.getKey()+" "+element.getValue());
        }
    }
}
