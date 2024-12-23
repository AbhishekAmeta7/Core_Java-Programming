class A{
    void show()throws Throwable{
        System.out.println("A class");
    }
}
class B extends A{
    void show()throws Throwable{
        super.show();
        System.out.println("B class");
    }
}
public class ExceptionOverridingCase12 {
    public static void main(String[] args) {
        B obj = new B();
        try {
            obj.show();
        } catch (Throwable e) {
            
        }
    }
}
