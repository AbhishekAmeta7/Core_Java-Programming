import java.util.*;
public class TreeMapCRUD {
    public static void main(String[] args) {
        TreeMap<Character,String> tm = new TreeMap<>();
        tm.put('J', "Apple");
        tm.put('P', "Python");
        tm.put('c', "C++");
        tm.put('K', "Hello");
        tm.put('R', "React");

        Set set=tm.entrySet();
        Iterator itr=set.iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer,Character> e = (Map.Entry<Integer,Character>)itr.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }

        System.out.println("Delete");
        tm.remove('R');
        System.out.println(tm);

        System.out.println("Update");
        tm.replace('J', "Java");
        System.out.println(tm);
        tm.replace('K', "Kotlin");
        System.out.println(tm);


    }
}
