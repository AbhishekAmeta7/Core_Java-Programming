interface A{
    default int show(int a){
        return a;
    }
    interface B{
        String greet();
        interface C{
            default void disp(int a){
                System.out.println("method in interface C "+a);
            }
        }
    }
}
class D implements A.B.C{
    D show1(){
        System.out.println("show1 method covariant return type in class D");
        return this;
    }
    String greet(){
        return "Good Morning";
    }
    public void disp(int a){
        System.out.println("method in interface C "+a);
    }
    int show(int a){
        return a;
    }
}
public class NestedInterface3{
    public static void main(String[] args) {
        D d = new D();
        System.out.println("method in interface A "+d.show(7));
        System.out.println("method in interace B "+d.greet());
        d.disp(9);
        d.show1();
    }
}
/*3): interface A :method1 :return and argument :define 
	interface B :method2 :return and no argument :declare
		interface C :method3 :no return and argument :define


class 
covariant return type 
access

Main 
class k through accesss*/