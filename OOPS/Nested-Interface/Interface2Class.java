interface A{
    interface B{
        class C{
            void method(){
                System.out.println("method in class C");
            }
        }
    }
    class D extends B.C{
       
    }
}
class E extends A.D{
   
}
public class Interface2Class{
    public static void main(String[] args) {
        E e = new E();
        e.method();
    }
}
/*11): interface 
	interface 
		class 

access*/