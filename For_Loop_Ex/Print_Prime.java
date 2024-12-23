import java.util.Scanner;
public class Print_Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = sc.nextInt();
        for (int i = 2; i <=a; i++) {
                int n = 2,count = 0;
                while(i>n){
                    if(i%n==0){
                    count++;
                    break;
                    }
                    n++;
                   }
                   if(a%a==0){
                    if(count == 0){
                        System.out.print(i+" ");
                  }
              }
        }
    }
}
