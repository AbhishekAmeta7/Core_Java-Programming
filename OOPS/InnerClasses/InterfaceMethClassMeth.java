interface A{
    default void disp1(){
        System.out.println("disp1 in interface A");
        class B{
            void disp2(){
                System.out.println("disp2 in class B");
            }
        }
        B b = new B();
        b.disp2();
    }
}
class C implements A{

}
public class InterfaceMethClassMeth{
    public static void main(String[] args) {
        C c = new C();
        c.disp1();   
    }
}
/*interface 
	method 
		class 
		method 
access*/