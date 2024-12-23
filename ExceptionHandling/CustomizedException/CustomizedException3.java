import java.util.Scanner;
class Vowel extends RuntimeException{
    public Vowel(String msg){
        System.out.println(msg);
    }
}
class Check {
    public void show(char c){
        if(c =='a' || c =='e' || c=='i' || c=='o' || c=='u'){
            System.out.println(c);
        }
        else{
            throw new Vowel("This is Not Vowel");
        }
    }
}
public class CustomizedException3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);
        Check c = new Check();
        c.show(ch);

    }
}
