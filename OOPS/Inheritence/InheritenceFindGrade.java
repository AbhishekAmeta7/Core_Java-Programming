import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    public Student(String firstName,String lastName,int idNumber,int[] testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }
    public char calculate() {
        int ans = 0;
        for (int i : testScores) {
            ans += i;
        }
        int avg = ans / testScores.length;

        if (avg >= 90) {
            return 'O'; 
        } else if (avg >= 80) {
            return 'E'; 
        } else if (avg >= 70) {
            return 'A'; 
        } else if (avg >= 55) {
            return 'P';
        } else if (avg >= 40) {
            return 'D'; 
        } else {
            return 'T';
        }
    }
}

class InheritenceFindGrade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();//Enter First Name
		String lastName = scan.next();//Enter Last Name
		int id = scan.nextInt();// Enter ID
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];//Enter No Of Scores
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();//Enter Scores
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
// Heraldo Memelli 8135627
// 2
// 100 80

// Name: Memelli, Heraldo
// ID: 8135627
// Grade: O