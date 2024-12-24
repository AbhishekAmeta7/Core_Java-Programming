import java.util.HashMap;
import java.util.Map;

public class CreateHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1, "Java");
        hm.put(2, "Python");
        hm.put(3, "C++");
        hm.put(4, "Kotlin");
        hm.put(5, "React");
        System.out.println(hm);
        Map<Integer,String> m = new HashMap<>();
        m.put(3, "Hello");
        System.out.println(m); 
    }
}