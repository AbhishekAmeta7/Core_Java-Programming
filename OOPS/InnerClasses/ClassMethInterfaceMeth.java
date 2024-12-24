class A{
    void show1(){
        System.out.println("Hello..");
        interface B{
            void show2();
        }
        B b = new B() {
            public void show2(){
                System.out.println("Good Morning");
            }
        };
        b.show2();
    }
}
public class ClassMethInterfaceMeth {
    public static void main(String[] args) {
        A a = new A();
        a.show1();
    }
}
/*class
	method
		interface 
			method 

access*/