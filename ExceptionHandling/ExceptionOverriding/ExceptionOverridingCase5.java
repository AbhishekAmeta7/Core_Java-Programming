class A{
    void show()throws ArithmeticException{
        System.out.println("A class");
    }
}
class B extends A{
    void show()throws Exception{
        System.out.println("B class");
    }
}
public class ExceptionOverridingCase5 {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}