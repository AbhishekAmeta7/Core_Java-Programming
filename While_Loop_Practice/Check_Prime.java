import java.util.Scanner;
public class Check_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int a = 2,count = 0;
        while(num>0 && a<=num){
            if(num%a==0){
                count++;
            }
            a++;
        }
        if(count == 1){
            System.out.println(num+" is Prime number");
        }
        else{
            System.out.println(num+" is not Prime number");
        }
    }
}
