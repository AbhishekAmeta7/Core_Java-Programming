import java.io.IOException;

class A{
    void show()throws IOException{
        System.out.println("A class");
    }
}
class B extends A{
    void show()throws IOException{
        super.show();
        System.out.println("B class");
    }
}
public class ExceptionOverridingCase3 {
    public static void main(String[] args) {
        B b = new B();
        try {
            b.show();
        } catch (Exception e) {
        }
    }
}
