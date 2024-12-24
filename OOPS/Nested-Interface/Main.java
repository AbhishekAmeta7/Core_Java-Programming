import java.util.Scanner;
interface Bank{
    void diposit(int amount);
    void withdraw(int amount);
    int checkBalance();
    void userDetails(String name,long acno,String ac_type);
}
class SBI implements Bank{
    private int amount;
    private String name,ac_type;
    private long acno;
    int totalBalance;
    public void userDetails(String name,long acno,String ac_type){
        this.name=name;
        this.acno=acno;
        this.ac_type=ac_type;
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+acno);
        System.out.println("Account Type: "+ac_type);
    }
    public void diposit(int amount){
        this.amount = amount;
        totalBalance = totalBalance+amount; 
    }
    public void withdraw(int amount){
        this.amount = amount;
        if(totalBalance>=amount){
            totalBalance = totalBalance-amount;
        } 
        else{
            System.out.println("Insufficient Bank Balance");
        }
    }
    public int checkBalance(){
        return totalBalance;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        long ac = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Account Type: ");
        String ac_type = sc.nextLine();
        SBI bank = new SBI();
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter Amount: ");
                    int amt = sc.nextInt();
                    bank.diposit(amt);
                    break;
                case 2:
                    System.out.print("Enter Amount: ");
                    amt = sc.nextInt();
                    bank.withdraw(amt);
                    break;
                case 3:
                    System.out.println(bank.checkBalance());
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice.....");
                    break;
            }
        }
        System.out.println("-------------X-------------");
        bank.userDetails(name,ac,ac_type);
        System.out.println(name+" Your Total Bank Balance is: "+bank.checkBalance());
    }
}
