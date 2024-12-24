class A1{
    interface A{
        void show();
    } 
    interface B{
        void show(String name);
    }
    interface C{
        int show1();
    }
    interface D{
        int show(int a);
    }
}
class E  implements  A1.A{
    public void show(){
        System.out.println("show method interface A");
    }
}
class F implements A1.B{
    public void show(String name){
        System.out.println("Name: "+name);
    }
}
class G implements A1.C{
    public int show1(){
        return 0;
    }
}
class H implements A1.D{
    public int show(int a){
        return a;
    }
}
public class NestedInterfaces1{
    public static void main(String[] args) {
        E e = new E();
        e.show();
        F f = new F();
        f.show("Abhishek Vyas");
        G g = new G();
        System.out.println("show1 method in C interface"+g.show1());
        H h = new H();
        System.out.println(h.show(7));
    }
}
/*6): class
	interface :no return and no argument 
	interface :no return and  argument 
	interface:  return and no argument 
	interface :  return and   argument

access */