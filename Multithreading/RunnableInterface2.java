interface A {
    void show();
}
interface B {
    void show1();
}
class C {
    void show2(){
        System.out.println("class C");
    }
}
class D extends C implements Runnable,A,B{
    public void run(){
        System.out.println("run() method");
    }
    public void show(){
        System.out.println("show() method");
    }
    public void show1(){
        System.out.println("show2() method");
    }
}
public class RunnableInterface2 {
    public static void main(String[] args) {
        D d = new D();
        Thread t = new Thread(d);
        t.start();
    }
}