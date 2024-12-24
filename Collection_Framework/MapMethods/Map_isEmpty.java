import java.util.*;
public class Map_isEmpty {
    public static void main(String[] args) {
        Map<Integer,Integer> m = new HashMap<>();
        m.put(2, 20);
        m.put(1, 10);
        m.put(5, 50);
        m.put(3, 30);
        m.put(4, 40);
        // m.clear();
        if(m.isEmpty()){
            System.out.println("Map is Empty");
        }
        else{
            System.out.println("Map is Not Empty");
        }
    }
}
