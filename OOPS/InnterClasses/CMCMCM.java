class A{
    void method1(){
        System.out.println("method1 class A");
        class B{
            void method2(){
                System.out.println("method2 class B");
                class C{
                    void method3(){
                        System.out.println("method3 class C");
                    }
                }
                C c = new C();
                c.method3();
            }
        }
        B b = new B();
        b.method2();
    }
}
public class CMCMCM {
    public static void main(String[] args) {
        A a = new A();
        a.method1();
    }
}
/*class
	method 
		class 
			method 
				class 

access */