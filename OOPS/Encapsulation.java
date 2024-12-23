import java.util.Scanner;
class BankAccount{
    private int balance;
    BankAccount(int balance){
        this.balance=balance;
    }
    double checkBalance(){
        return balance; }
    public void diposit(int amount){
        balance += amount;}
    public void withdrawal(int amount){
         if(balance>amount){
             balance -= amount;
                System.out.println("Minimum balance requirement of Rs 1000");}
        else{
            System.out.println("Insufficient Bank Balance");}
    }
}public class Encapsulation{
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(1000);
        Scanner sc = new Scanner(System.in);
        System.out.println("w-->Withdrawal\nd-->diposit\nc-->Check Balance");
        System.out.print("How many process do you want: ");
        int n = sc.nextInt();
        int amt = 0;
        for(int i = 1;i<=n;i++){
            System.out.print("Enter Your Choice: ");
        char ch = sc.next().charAt(0);
            switch(ch){
            case 'w':
               System.out.print("Enter Amount: ");
               amt = sc.nextInt();
               ba.withdrawal(amt);
               break;
            case 'd':
               System.out.print("Enter Amount: ");
               amt = sc.nextInt();
               ba.diposit(amt);
               break;
            case 'c':
               System.out.println("Bank Balance is: "+ba.checkBalance());
               break;
            case 'e':
                 System.exit(0);
            default :
               System.out.println("Invalid Choice....");
               break; } }
    }
}

