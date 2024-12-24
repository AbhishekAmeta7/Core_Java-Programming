class A extends Thread {
    int total = 0;
    public void run() {
        synchronized(this) {
            for (int i = 1; i <= 10; i++) {
                total = total+100;
            }
            this.notify();
        }
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) throws InterruptedException{
        A a = new A();
        a.start();
        synchronized(a) {
            a.wait();
            System.out.println("Total: "+a.total);
        }
    }
}
