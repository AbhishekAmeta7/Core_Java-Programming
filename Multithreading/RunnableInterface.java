class A implements Runnable {
    public void run(){
        System.out.println("Runnable Interface");
    }
}
public class RunnableInterface {
    public static void main(String[] args) {
        A a = new A();
        Thread t = new Thread(a);
        t.start();
    }
}
