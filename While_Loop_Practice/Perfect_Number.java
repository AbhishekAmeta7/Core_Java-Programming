import java.util.Scanner;
public class Perfect_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int i = 1,ans = 0;
        while(i<num){
            if(num%i == 0){
                ans = ans + i;
                
            }
            i++;
        }
        if(num == ans){
            System.out.println(ans+" is perfect number");
        }
        else{
            System.out.println(ans+" is not perfect number");
        }
    }
}
