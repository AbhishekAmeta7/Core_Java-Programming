class A extends Exception{
    public A(String s){
        System.out.println(s);
    }
}
public class ThrowCase4 {
    public static void main(String[] args) {
        throw new A("Hello World");
    }
}
//Caught using a try-catch block.
// Declared using the throws clause in the method signature.