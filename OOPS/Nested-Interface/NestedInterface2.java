interface A{
    int printNum(int a);
    interface B{
        String printName();
        interface C{
            void disp(int a);
        }
    }
}
class D implements A.B.C{
    public int printNum(int a){
        return a;
    }
    public String printName(){
        String name = "Abhishek";
        return name;
    }
    public void disp(int a){
        System.out.println(a);
    }
}
public class NestedInterface2{
    public static void main(String[] args){
        D d = new D();
        System.out.println(d.printNum(80));
        System.out.println("Name: "+d.printName());
        d.disp(7);
    }
}
/*2): interface A :method1 :return and argument 
	interface B :method2 :return and no argument 
		interface C :method3 :no return and argument 


class 
access

Main 
class k through accesss*/