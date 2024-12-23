import java.util.Scanner;

class Email extends RuntimeException{
    public Email(String s){
        System.out.println(s);
    }
}
class B{
    public static void disp(String s,int a){
        if(s.equals("abc") && a == 123){
            System.out.println("Email: "+s+"\nPAssword: "+a);
        }
        else{
            throw new Email("Incorrect Email and Password");
        }
    }
}
public class CustomizedException4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Email: ");
        String e = sc.next();
        System.out.print("Enter Password: ");
        int pass = sc.nextInt();
        B.disp(e, pass);
    }
}
