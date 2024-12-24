class A {
    public void show(){
        System.out.println("A class");
    }
}
class B extends A implements Runnable {
    public void run(){
        System.out.println("B Thread Class ");
    }
}
public class RunnableInterface1 {
    public static void main(String[] args) {
        B b = new B();
        Thread t = new Thread(b);
        t.start();
    }
}
