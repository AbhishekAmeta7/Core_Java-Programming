import java.util.*;
class A extends RuntimeException{
    public A(String s){
        System.out.println(s);
    }
}
class B{
    void show(int a,int b, int c){
        if(a>b && a>c){
            throw new A("a is Max");
        }
        else if(b>a && b>c){
            throw new A("b is Max");
        }
        else{
            throw new A("c is Max");
        }
    }
}
public class CustomizedException5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        B obj = new B();
        obj.show(a, b, c);


    }
}
// 5)three number maximum : 
// 	otherwise :exception 
// 	constructor :message print 