import java.util.Scanner;
class Employee{
    private String name;
    private int age;
    private int salary;
    Employee(String name,int age,int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    int calculateBonus(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nSalary: "+salary);
        int bonus = 0; 
        bonus = (salary*10)/100;
        return bonus;
    }
    int calculateBonus(int attendance){
        System.out.println("Name: "+name+"\nAge: "+age+"\nSalary: "+salary);
        int bonus = 0; 
        if(attendance>=25){
            bonus = (salary*5)/100;
        }
        else{
            bonus = (salary*0)/100;
        }
        return bonus;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter Monthly Attendance: ");
        int attendance = sc.nextInt();
        Employee emp1 = new Employee(name , age , salary);
        System.out.println("Yearly Bonus Of "+name+" is: "+emp1.calculateBonus());
        System.out.println("Yearly Bonus Of "+name+" is: "+emp1.calculateBonus(attendance));   
    }
}

// 4. Implement a class `Employee` with fields `name`, `age`, and `salary`. 
// Write methods to calculate the yearly bonus (10% of salary), and print
// the employee's details.
//  Demonstrate method overloading by implementing different
 //methods for calculating bonus for different employee levels.