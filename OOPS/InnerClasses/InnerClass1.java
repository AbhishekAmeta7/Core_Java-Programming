class A{
    class B{
        void show(){
            System.out.println("show method in class B");
        }
    }
}
public class InnerClass1{
    public static void main(String[] args) {
        A k=new A();
        A.B p=k.new B();
        p.show();
    }
}
/*class 
	class 
	method 
method 

access*/