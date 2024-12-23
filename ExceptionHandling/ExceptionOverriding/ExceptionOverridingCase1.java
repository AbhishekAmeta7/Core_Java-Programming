import java.io.IOException;

class A{
    void show()throws ArithmeticException{
        System.out.println("A class");
    }
}
class B extends A{
    void show()throws IOException{
        System.out.println("B class");
    }
}
public class ExceptionOverridingCase1{
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}