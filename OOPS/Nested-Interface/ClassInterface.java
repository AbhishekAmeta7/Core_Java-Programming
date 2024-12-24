class A1{
    interface A{
        void show();
    }
    interface B{
        void show1(String s);
    }
    interface C{
        String show2();
    }
    interface D{
        int show3(int a);
    }
    interface E{
        E show4();
    }
}
class F extends A1{
    public void show(){
        System.out.println("show method in class A");
    }
    public void show1(String s){
        System.out.println(s);
    }
    public String show2(){
        String name = "Abhishek";
        return name;
    }
    public int show3(int a){
        return a;
    }
    public F show4(){
        System.out.println("show method with covarient return type");
        return this;
    }
}
public class ClassInterface{
    public static void main(String[] args) {
        F f = new F();
        f.show();
        f.show1("Good Morning");
        System.out.println(f.show2());
        System.out.println(f.show3(7));
        f.show4();
    }
}
/*6): class
	interface :no return and no argument 
	interface :no return and  argument 
	interface:  return and no argument 
	interface :  return and   argument

access */