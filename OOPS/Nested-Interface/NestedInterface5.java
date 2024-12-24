interface A{
    interface B{
        
    }
    class C implements A.B{
        void method(){
            System.out.println("method in C class");
        }
    } 
}
public class NestedInterface5 {
    public static void main(String[] args) {
        A a = new A(){
            a.method();
        };
    }
}
/*13): interface 
	interface 
		class 

access
anonymous inner class*/