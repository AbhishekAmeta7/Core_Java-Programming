import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class HashMapPrintIterator {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1, "Java");
        hm.put(3, "Python");
        hm.put(4, "C");
        hm.put(2, "Kotlin");
        //typecast :entry set()
        Set set=hm.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry e=(Map.Entry)itr.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
