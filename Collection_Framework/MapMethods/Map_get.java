import java.util.*;
public class Map_get {
    public static void main(String[] args) {
        Map<Character,String> m = new HashMap<>();
        m.put('A', "Alice");
        m.put('B', "Bob");
        m.put('C', "Charlie");
        m.put('D', null);
        m.put('J', "John");
        System.out.println(m.get('A'));
        if(m.get('D')==null){
            System.out.println("Does Not Exist");
        }
    }
}
