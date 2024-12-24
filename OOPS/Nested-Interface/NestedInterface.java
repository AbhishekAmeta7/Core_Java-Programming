interface A{
    interface B{
        void show();
    }
}
class C implements A.B{
    public void show(){
        System.out.println("Show Method");
    }
}
public class NestedInterface{
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}
/*interface A
	interface B
	method :no return and no argument 

class 
access

Main 
class k through accesss*/