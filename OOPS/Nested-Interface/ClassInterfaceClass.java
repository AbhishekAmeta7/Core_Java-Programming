class A{
    
    interface B{
        
        class C{
            void disp2(){
                System.out.println("disp2 method in class C");
            }
        }
    }
    class D extends B.C{
        
    }
}
class E implements A.B{
    void disp2(){
        System.out.println("disp2 method in class C");
    }
}
public class ClassInterfaceClass{
    public static void main(String[] args) {
        E e = new E();
        e.disp2();
    }
}
/*7): class
     interface 
	class 

access*/