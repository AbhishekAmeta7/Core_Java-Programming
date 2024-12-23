import java.util.Scanner;
class Student{
    private String name;
    private int rollno;
     int marks;  
    Student(int rollno,int marks){
        this.rollno=rollno;
        this.marks=marks;
    }
    Student(String name){
        this.name=name;
    }
    void calculateGrade(){
        System.out.println("Name: "+name+"\nRoll No: "+rollno);
        if(marks>90){
            System.out.println("Grade: A");
        }
        else if(marks>70 && marks<=90){
            System.out.println("Grade: B");
        }
        else if(marks>50 && marks<=70){
            System.out.println("Grade: C");
        }
        else if(marks>=36 && marks<=50){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Fail");
        }
    }
}
public class Marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll No. ");
        int rollno = sc.nextInt();
        System.out.print("Enter Marks: ");
       int marks = sc.nextInt();
      
        Student s = new Student(rollno,marks);
        new Student(name);
        s.calculateGrade();
    }
}

