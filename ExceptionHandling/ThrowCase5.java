class A extends RuntimeException{
    public A(String s){
        System.out.println(s);
    }
}
public class ThrowCase5 {
    public static void main(String[] args) {
        throw new A("Hello");
    }
}
