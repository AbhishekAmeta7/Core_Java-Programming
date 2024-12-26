import java.util.*;
class Person {
    int age;
    Person(int age) {
        this.age = age;
    }
}
public class UserDefineWrapperLinkedHashMap {
    public static void main(String[] args) {
        Person p=new Person(18); 
        Person k=new Person(27);
        LinkedHashMap<String,Person> lhm=new LinkedHashMap<>();
        lhm.put("Alice", p);
        lhm.put("Charlie", k);
        Set<Map.Entry<String,Person>> set = lhm.entrySet();
        System.out.println("Name"+ "    Age");
        for(Map.Entry<String,Person> hm:set){
         String s=hm.getKey();
         Person l=hm.getValue();
         System.out.println(s+"   "+l.age);
        }
    }
}
