package comparatorPkg;

import java.util.*;
class Student {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name,int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

      
    @Override
    public String toString() {
        return rollno + " " + name+" "+age;
    }
}

class SortbyRoll implements Comparator<Student> 
{    
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

class SortByName implements Comparator<Student>{
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}
public class SortingComparator {

	public static void main(String[] args) {
		List<Student> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of List: ");
        int n = sc.nextInt();
        int rollno = 0,age = 0;
        String name;
        for(int i = 0; i < n; i++) {
        	System.out.println("Enter RollNo, Name, Age: ");
        	rollno = sc.nextInt();
        	name = sc.next();
        	age = sc.nextInt();
        	Student s = new Student(rollno,name,age);
        	li.add(s);
        }
        
        System.out.println(li);

      Collections.sort(li, new SortbyRoll());

        System.out.println("Sorted by Roll Number ");

      for (int i = 0; i < li.size(); i++)
          System.out.println(li.get(i));
          
      Collections.sort(li, new SortByName());

      System.out.println("Sorted by Roll Name ");

      for (int i = 0; i < li.size(); i++)
          System.out.println(li.get(i));
	}

}
