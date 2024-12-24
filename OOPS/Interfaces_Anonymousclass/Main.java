import java.util.*;
class Bank{
    private String name;
    private long ac;
    private String acType;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setAc(long ac){
        this.ac=ac;
    }
    long getAc(){
        return ac;
    }
    void setAcType(String acType){
        this.acType=acType;
    }
    String getAcType(){
        return acType;
    }
}
class B extends Bank{
    int total,amt;
    int withdraw(int total,int amt){
        this.total=total;
        this.amt=amt;
        return total;
         
    }
    int diposite(int total,int amt){
        this.total=total;
        this.amt=amt;
        return (total+=amt); 
    }
    int getAmt(){
        return total;
    }
}
public class Main{
    public static void main(String[] args){
        B b = new B();
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        b.setName(name);
        long ac = sc.nextLong();
        b.setAc(ac);
        String acType = sc.next();
        b.setAcType(acType);
        String str = sc.next();
        switch (str) {
            case "withdraw":
                int amt = sc.nextInt();
                b.withdraw(70000, amt);
                break;
            case "diposit":
                 amt = sc.nextInt();
                 b.diposite(50000, amt);
                 break;
            default:
                break;
        }
        System.out.println("Name: "+b.getName());
        System.out.println("A/C Number: "+b.getAc());
        System.out.println("Account Type: "+b.getAcType());
        System.out.println("Total: "+b.getAmt());
    }
}
