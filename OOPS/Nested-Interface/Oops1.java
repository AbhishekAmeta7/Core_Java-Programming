import java.util.*;
class Employee{
    private int salary;
    public void setSalary(int salary){
        this.salary=salary;
    }
    int calculateSalary(){
        return salary;
    }
}
class Manager extends Employee{
    private int salary;
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int calculateSalary(){
        int pf = 0,tax = 0,basicSalary = 0;
        if(salary>20000){
             pf = salary*20/100;
             tax = salary*9/100;
             basicSalary = salary-(tax+pf);
        }
        else if(salary>=100000 && salary<=200000){
             pf = salary*15/100;
             tax = salary*6/100;
             basicSalary = salary-(tax+pf);
        }
        else if(salary<100000 && salary>=50000){
             pf = salary*12/100;
             tax = salary*5/100;
             basicSalary = salary-(tax+pf);
        }
        else{
             pf = salary*10/100;
             tax = salary*5/100;
             basicSalary = salary-(tax+pf);
        }
        return basicSalary;
    }
}
class Worker extends Employee{
    private int salary;
    int pf = 0,tax = 0,basicSalary = 0;
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int calculateSalary(){
        if(salary>=200000){
            pf = salary*20/100;
            tax = salary*9/100;
            basicSalary = salary-(tax+pf);
        }
        else if(salary<200000 && salary >=100000){
            pf = salary*15/100;
            tax = salary*7/100;
            basicSalary = salary-(tax+pf);
        }
        else{
            pf = salary*10/100;
            tax = salary*5/100;
            basicSalary = salary-(tax+pf);
        }
        return basicSalary;
    }
}
public class Oops1{
    public static void main(String[] args){
        Employee man = new Manager();
        Employee work = new Worker();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Gross Salary Of Manager Salary: ");
        int salary = sc.nextInt();
        man.setSalary(salary);
        System.out.print("Enter Gross Salary Of Worker Salary: ");
        int s = sc.nextInt();
        work.setSalary(s);
        System.out.println("---------------------X---------------------");
        System.out.println("Monthly Basic Salary Of Manager: "+man.calculateSalary());
        System.out.println("Monthly Basic Salary Of Worker: "+work.calculateSalary());
    }
}
/*PArent Class --> Employee| Child Class --> Manager , Worker | calculateSalary() */