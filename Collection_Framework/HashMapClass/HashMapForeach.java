import java.util.*;

public class HashMapForeach {
    public static void main(String[] args) {
        HashMap<Integer , String> hm = new HashMap<>();
        hm.put(3, "Kotlin");
        hm.put(4, "Python");
        hm.put(1, "Java");
        hm.put(2, "C");
        for(Map.Entry element:hm.entrySet()){
            System.out.println(element.getKey()+" "+element.getValue());
           }
    }
}
