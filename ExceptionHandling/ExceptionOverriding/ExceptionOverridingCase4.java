class A{
    void show()throws Exception{
        System.out.println("A class");
    }
}
class B extends A{
    void show()throws Exception{    
        super.show();
        System.out.println("B class");
    }
}
public class ExceptionOverridingCase4 {
    public static void main(String[] args) {
        B b = new B();
        try {
            b.show();
        } catch (Exception e) {

        }
    }
}
