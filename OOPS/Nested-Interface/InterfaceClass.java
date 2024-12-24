interface A1{
    class A{
        public void show(){
            System.out.println("show method in class A");
        }
    }
    class B{
        public void show(String s){
            System.out.println(s);
        }
    }
    class C{
        public String show(){
            String name = "Abhishek";
            return name;
        }
    }
    class D{
        public int show(int a){
            return a;
        }
    }
    class E{
        public E show(){
            System.out.println("show method with covarient return type");
            return this;
        }
    }
}
class F extends A1.A{
    
}
class G extends A1.B{
    
}
class H extends A1.C{
    
}
class I extends A1.D{
    
}
class J extends A1.E{
    
}
public class InterfaceClass{
    public static void main(String[] args) {
        F f = new F();
        f.show();
        G g = new G();
        g.show("Java");
        H h = new H();
        System.out.println(h.show());
        I i = new I();
        System.out.println(i.show(7));
        J j = new J();
        j.show();
    }
}
/*5): interface 
	class :no return and no argument 
	class:no return and  argument 
	class: return and no argument 
	class:  return and  argument 
	class :covariant return type 

access*/