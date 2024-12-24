interface A{
    void method1();
    interface B{
        void method2();
        class C{
            void method3(){
                System.out.println("method3 inside class C");
            }
        }
    }
    class D extends B.C{
        void method2(){
            System.out.println("method2 inside interface B");
        }
    }
}
class E extends A.D{
    void method1(){
        System.out.println("method1 inside interface A");
    }
}
public class Interface2Classmethod{
    public static void main(String[] args) {
        E e = new E();
        e.method1();
        e.method2();
        e.method3();
    }
}
/*12): interface :method 
	interface :method :define  
		class :method 

access*/