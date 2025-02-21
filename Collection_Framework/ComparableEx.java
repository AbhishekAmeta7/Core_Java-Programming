
import java.util.*;

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String phone;
	
	@Override
	public int compareTo(Employee o) {
		return this.id-o.id;
	}
	Employee(int id , String name, String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	
	@Override
	public String toString() {
		return '{'+"\nID: "+id+"\nName: "+name+"\nPhone: "+phone+"\n"+'}';
	}
}
public class ComparableEx {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size Of List: ");
		int n = sc.nextInt();
		for(int i = 0;i < n; i++) {
			System.out.println("Enter ID , Name, PhoneNo. : ");
			Employee emp = new Employee(sc.nextInt(),sc.next(),sc.next());
			al.add(emp);
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println("<-----------Sorting----------->");
		System.out.println(al);
	}

}
