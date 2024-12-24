import java.util.Scanner;

public class Even_Odd {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Choice even Or odd: ");
        String s = sc.next();
        int num = 1;
        if(s.equals("even")){
            System.out.print("Enter Choice type1,type2,type3 or type4: ");
            String ch = sc.next();
            if(ch.equals("type1")){;
                while(num<=100){
                    if(num%2==0){
                        System.out.print(num+" ");
                    }
                    num++;
                }
            }
            else if(ch.equals("type2")){
                int sum = 0;
                 while(num<=100){
                    if(num%2==0){
                        sum = sum+num;
                    }
                    num++;
                }
                System.out.print("Sum Of Even Number 1-100: "+sum);
            }
            else if(ch.equals("type3")){
                int a = 34;
                int b = 89;
                 while(a<=b){
                    if(a%2==0){
                        System.out.print(a+" ");
                    }
                    a++;
                }
            }
            else if(ch.equals("type4")){
                 int a = 34;
                int b = 89,sum=0;
                 while(a<=b){
                    if(a%2==0){
                        sum = sum+a;
                    }
                    a++;
                }
                 System.out.print("Sum of Even: "+sum);
            }
            else{
                System.out.print("Invalid Choice!");
            }
        }
        else if(s.equals("odd")){
            System.out.print("Enter Choice type1,type2,type3 or type4: ");
            String ch = sc.next();
            int sum = 0;
            if(ch.equals("type1")){
                while(num<=100){
                    if(num%2 != 0){
                        System.out.print(num+" ");
                    }
                    num++;
                }
            }
            else if(ch.equals("type2")){
                while(num<=100){
                    if(num%2 != 0){
                        sum = sum+num;
                    }
                    num++;
                }
                System.out.print("Sum Of Odd Number 1-100: "+sum);
            }
            else if(ch.equals("type3")){
                int a = 34;
                int b = 89;
                 while(a<=b){
                    if(a%2!=0){
                        System.out.print(a+" ");
                    }
                    a++;
                }
            }
            else if(ch.equals("type4")){
                int a = 34;
                int b = 89;
                 while(a<=b){
                    if(a%2!=0){
                        sum = sum+a;
                    }
                    a++;
                }
                System.out.println("Sum Of odd: "+sum);
            }
            else{
                System.out.println("Invalid Choice!");
            }
        }
        else{
            System.out.println("Invalid Choice!");
        }
    }
}
