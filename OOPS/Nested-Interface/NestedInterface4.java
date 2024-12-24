interface A{
    void show1();
    interface B{
        int show2(int a);
        interface C{
            int show3();
            interface D{
                void show4(int a);
            }
        }
    }
}
interface B{
    void show1();
    interface A{
        int show2(int a);
        interface C{
            int show3();
            interface D{
                void show4(int a);
            }
        }
    }
}
interface C{
    void show1();
    interface A{
        int show2(int a);
        interface B{
            int show3();
            interface D{
                void show4(int a);
            }
        }
    }
}
class E implements A.B.C.D{
    public void show1(){
        System.out.println("show1 method");
    }
    public int show2(int a){
        return a;
    }
    public int show3(){
        int a = 90;
        return a;
    }
    public void show4(int a){
        System.out.println("show4 method "+a);
    }
}
public class NestedInterface4{
    public static void main(String[] args) {
        E e = new E();
        e.show1();
        System.out.println("show2 method "+e.show2(8));
        System.out.println("show3 method "+e.show3());
        e.show4(7);
    }
}
/*4): interface A :method1 : no return and no argument 
	interface :method2:no return and  argument 
		interface:method3 : return and no argument 
			interface :method4: return and  argument 

interface A :method1 : no return and no argument 
	interface :method2:no return and  argument 
		interface:method3 : return and no argument 
			interface :method4: return and  argument 

interface A :method1 : no return and no argument 
	interface :method2:no return and  argument 
		interface:method3 : return and no argument 
			interface :method4: return and  argument 

implement all interface in single class 

Main :access*/