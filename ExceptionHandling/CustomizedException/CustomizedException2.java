import java.util.*;
class Even extends RuntimeException{
    public Even(String s){
        System.out.println(s);
    }
}
class Check{
    static void show(int a){
        if(a%2!=0){
            throw new Even("Number is Odd");
        }
        else{
            System.out.println("Number is: "+a);
        }
    }
}
public class CustomizedException2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        Check.show(n);
    }
}