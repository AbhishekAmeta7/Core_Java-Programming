class A{
    void show1(){
        System.out.println("show1 inside class B");
    }
    class B{
        void show2(){
            System.out.println("show2 inside class C");
        }
        interface C{
            void show3();
        }   
    }
}
class D implements A.B.C {
    public void show3(){
        System.out.println("show3 inside interface C");
    }
}
public class InterfaceClassClassInterface{
    public static void main(String[] args) {
        D d = new D();
        A sc=new A();
        A.B sccc= sc.new B();
        sc.show1();
        sccc.show2();    
        d.show3();
    }
}
/*interface 
method
	class 
	method
		class 
		method
			interface 
			method

access*/