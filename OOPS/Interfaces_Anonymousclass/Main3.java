class Employee{
    int id;
    String name;
    void displayDetails(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Manager extends Employee{
    void displayDetails(int id,String name){
        super.displayDetails(id,name);
        System.out.println("Manager Id: "+id);
        System.out.println("Manager Name: "+name);
    }
}
class Clerk extends Employee{
     void displayDetails(int id,String name){
         super.displayDetails(id,name);
        System.out.println("Clerk Id: "+id);
        System.out.println("Clerk Name: "+name);
    }
}
public class Main3{
    public static void main(String[] args) {
       Employee emp = new Manager();
       emp.displayDetails(101,"Abhi");
       emp = new Clerk();
       emp.displayDetails(111,"Virendra");
    }
}
