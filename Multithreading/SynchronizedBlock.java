class A {
    public void wish(int n) {
        synchronized(this) {
            for (int i = 1; i <= n; i++) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    
                }
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
class B extends Thread {
    A a;
    B(A a) {
        this.a = a;
    }
    public void run() {
        a.wish(10);
    }
}
class C extends Thread {
    A a;
    C(A a) {
        this.a = a;
    }
    public void run() {
        a.wish(5);
    }
}
public class SynchronizedBlock {
    public static void main(String[] args) {
        A s = new A();
        B b = new B(s);
        C c = new C(s);
        b.start();
        c.start();
    }
}
