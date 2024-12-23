import java.io.IOException;

class A{
    void show()throws Exception{
        System.out.println("A class");
    }
}
class B extends A{
    void show()throws IOException{
        try {
            super.show();
        } catch (Exception e) {
            
        }
        System.out.println("B class");
    }
}
public class ExceptionOverridingCase7 {
    public static void main(String[] args) {
        B p = new B();
        try {
            p.show();
        } catch (Exception e) {
            
        }
    }
}
