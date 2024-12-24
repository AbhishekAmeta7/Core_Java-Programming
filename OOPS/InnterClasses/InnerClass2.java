class A{
    void show(){
        System.out.println("show method inside A class");
    }
    class B{
        void show1(){
            System.out.println("show1 method inside B class");
        }
        class C{
            void show2(){
                System.out.println("show2 method inside C class");
            }
        }
    }
}
public class InnerClass2 {
    public static void main(String[] args) {
        A k=new A();
        k.show();
        A.B p=k.new B();
        p.show1();
        A.B.C c = p.new C();
        c.show2();
        
    }
}
/*
  A k=new A();
        k.show1();
        A.B p=k.new B();
        p.show();
*/
/*class 
method 
	class 
	method 
		class 
		method 

access */