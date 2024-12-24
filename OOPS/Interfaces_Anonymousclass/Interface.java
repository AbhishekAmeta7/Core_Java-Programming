interface A{
	public void show1();
	public int show2();
	public int show3(int a);
    public void show4(int a);
}
class B implements A{
	public void show1(){
		System.out.println("method no return & no argument");
	}
	public int show2(){
		System.out.println("method return & no argument");
		return 0;
	}
	public int show3(int a){
		return a;
	}
	public void show4(int a){
		System.out.println("method no return & argument" +a);
	}
}
public class Interface{
    public static void main(String[] args) {
        B b = new B();
		b.show1();
		b.show2();
		System.out.println("method return and argument "+b.show3(67));
		b.show4(89);
    }
}
/*interface 
	method1 :no return and no argument 
	method2 : return and no argument 
	method3: return and  argument 
	method4 :no return and  argument

class B imple 

Main class access*/