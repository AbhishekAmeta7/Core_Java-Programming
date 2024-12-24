import java.util.*;
public class Map_containsValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Character> m = new HashMap<>();
        m.put(1, 'A');
        m.put(4, 'D');
        m.put(3, 'C');
        m.put(5, 'E');
        m.put(2, 'B');
        System.out.print("Enter Value: ");
        char x = sc.next().charAt(0);
        if(m.containsValue(x)){
            System.out.println("Yes! "+x+" is Present in the Map");
        }
        else{
            System.out.println("No! "+x+" is Not Present in the Map");
        }
        
    }
}
