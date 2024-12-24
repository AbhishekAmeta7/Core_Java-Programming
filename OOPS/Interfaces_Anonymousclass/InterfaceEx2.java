interface A{
    void disp();
}
interface B{
    int disp1();
}
interface C{
    int disp3(int a);
}
interface D{
    void disp4(int a);
}
class E implements A,B,C,D{
    public void disp(){
        System.out.println("disp method no return and no argument");
    }
    public int disp1(){
        System.out.println("disp1 method with return and no argument");
        return 0;
    }
    public int disp3(int a){
        return a;
    }
    public void disp4(int a){
        System.out.println("disp4 method no return and with argument "+a);
    }
}
public class InterfaceEx2{
    public static void main(String[] args) {
        A a1 = new E();
        a1.disp();
        B b = new E();
        b.disp1();
        C c = new E();
        System.out.println("disp3 method with return and with argument "+c.disp3(99));
        D d = new E();
        d.disp4(11);
    }
}
/*refrence variable through : 
interface 
	method1 :no return and no argument :abstract 

interface 
	method2 : return and no argument :non abstract

interface 
	method3: return and  argument :abstract

interface 
	method4 :no return and  argument: non abstract

class B imple 

Main class access*/