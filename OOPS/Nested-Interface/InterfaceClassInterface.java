interface A{
    void show1();
    class B{
        String show2(){
            return "Interface Class Interface";
        }
        interface C{
            int show3();
        }
    }
    class D implements B.C{
        public int show3(){
            return 7;
        }
    }
}
class E extends A.B{
    void show1(){
        System.out.println("show1 method in interface A");
    }
}
class F extends A.D{

}
public class InterfaceClassInterface{
    public static void main(String[] args) {
        E e = new E();
        e.show1();
        System.out.println(e.show2());
        F f = new F();
        System.out.println(f.show3());
    }
}
/*8): interface 
	class
		interface 

access*/