import java.util.*;;
public class Map_replace {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();
        m.put(1, "Hello");
        m.put(2, "Hiii");
        m.put(4, "bye");
        m.put(3, "Hey");
        System.out.println(m);
        m.replace(1,"Hello!....");
        m.replace(2,"Hiii","Hiii....");
        Set<Map.Entry<Integer,String>> set = m.entrySet();
        for (Map.Entry<Integer,String> entry : set) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        } 
    }
}
