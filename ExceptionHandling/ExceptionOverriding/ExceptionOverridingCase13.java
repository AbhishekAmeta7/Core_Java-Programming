class A{
    void show() throws Throwable{
        System.out.println("A class");
    }
}
class B extends A{
    void show() throws RuntimeException{
        try {
            super.show();
        } catch (Throwable e) {
            
        }
        System.out.println("B class");
    }
}
public class ExceptionOverridingCase13 {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
