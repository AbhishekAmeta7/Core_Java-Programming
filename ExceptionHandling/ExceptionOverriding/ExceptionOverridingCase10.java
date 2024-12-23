class A{
    void show() throws Throwable{
        System.out.println("A class ");
    }
}
class B extends A{
    void show()throws Exception{
        try {
            super.show();
        } catch (Throwable e) {
            
        }
        System.out.println("B class");
    }
}
public class ExceptionOverridingCase10 {
    public static void main(String[] args) {
        B p = new B();
        try {
            p.show();
        } catch (Exception e) {
            
        }
    }
}
