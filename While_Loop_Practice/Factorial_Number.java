import java.util.Scanner;
public class Factorial_Number {  
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number: ");
            int num = sc.nextInt(),fact = 1 ;
            int temp = num;
            while(num>=1 ){
              fact = fact*num;
              num--; 
            }
            System.out.println("Factorial "+temp+" is: "+fact);
        }
    }

