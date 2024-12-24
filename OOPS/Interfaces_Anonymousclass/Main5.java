import java.util.Scanner;
abstract class Bank{
    abstract int checkBalance();
    abstract int withdraw(int amount);
    abstract int diposit(int amount);
}
class SBI extends Bank{
    int balance;
    int amount;
    public int checkBalance(){
      return balance;
    }
    public int withdraw(int amount){
        this.amount = amount;
        if(balance>amount){
            System.out.println("Your Balance is Insufficient");
        }
        else{
            balance-=amount;   
        }
        return balance;
    }
    public int diposit(int amount){
            this.amount = amount;
            balance+=amount;
            return balance; 
   }
}
public class Main5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SBI sb = new SBI();
        int b =0;
        System.out.print("how many time you want perform operation: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("c--> For Check Balance\nw--> For Withdraw Balance\nd--> For Diposit Balance\ne--> For Exit: ");
            System.out.print("Enter Choice: ");
            char ch = sc.next().charAt(0);
            switch(ch){
                case 'c':
                  System.out.println( sb.checkBalance());
                    break;
                case 'w':
                    System.out.print("Enetr Amount: ");
                    int amt = sc.nextInt();
                    sb.withdraw(amt);
                    break;
                case 'd':
                    System.out.print("Enetr Amount: ");
                    amt = sc.nextInt();
                    sb.diposit(amt);
                    break;
                case 'e':
                    System.exit(0);
                    break;
                default :
                    break;
            }
        }
    }
}