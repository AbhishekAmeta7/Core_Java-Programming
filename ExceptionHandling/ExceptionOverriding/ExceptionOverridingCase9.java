class A{
    void show()throws RuntimeException{
        System.out.println("Hello");
    }
}
class B extends A{
    void show() throws Exception{
        System.out.println("B class");
    }
}
public class ExceptionOverridingCase9 {
    public static void main(String[] args) {
        B p = new B();
        try {
            p.show();
        } catch (Exception e) {
            
        }
    }
}
