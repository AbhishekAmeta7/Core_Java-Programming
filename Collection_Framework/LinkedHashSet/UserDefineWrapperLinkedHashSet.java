import java.util.*;
class Student {
    int age;
    String name;
    Student(int age , String name){
        this.age = age;
        this.name=name;
    }
}
public class UserDefineWrapperLinkedHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size Of ArrayList: ");
        int n = sc.nextInt();
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            String name = sc.nextLine();
            Student s = new Student(age, name);
            lhs.add(s);
        }
        System.out.println("------------X------------");
        for (Student s1 : lhs) {
            System.out.println(s1.age+" "+s1.name);
        }
    }
}