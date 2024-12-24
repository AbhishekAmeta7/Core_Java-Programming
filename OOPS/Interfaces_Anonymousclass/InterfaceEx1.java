interface A{
    void show();
}
interface B{
    int show1();
}
interface C{
    int show3(int a);
}
interface D{
    void show4(int a);
}
class E implements A,B,C,D{
    public void show(){
        System.out.println("show method no return and no argument");
    }
    public int show1(){
        System.out.println("show method with return and no argument");
        return 0;
    }
    public int show3(int a){
        return a;
    }
    public void show4(int a){
        System.out.println("show method no return and with argument "+a);
    }
}
public class InterfaceEx1{
    public static void main(String[] args) {
        E e = new E();
        e.show();
        e.show1();
        System.out.println("show method with return and with argument "+e.show3(99));
        e.show4(11);
    }
}
/*interface 
	method1 :no return and no argument 

interface 
	method2 : return and no argument 

interface 
	method3: return and  argument 

interface 
	method4 :no return and  argument

class B imple 

Main class access*/