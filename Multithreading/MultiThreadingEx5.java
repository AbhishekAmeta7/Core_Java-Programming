class A extends Thread {
    public void run(){
        for(int i = 1; i<=10; i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
            System.out.print(2*i+" ");
        }
       System.out.println();
    }
}
class B extends Thread {
    public void run(){
        for(int i = 1; i<=10; i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
            System.out.print(3*i+" ");
        }
       System.out.println();
    }
}
class C extends Thread {
    public void run(){
        for(int i = 1; i<=10; i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
            System.out.print(4*i+" ");
        }
        System.out.println();
    }
}
class D extends Thread {
    public void run(){
        for(int i = 1; i<=10; i++){
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                
            }
            System.out.print(5*i+" ");
        }
        System.out.println();
    }
}
class E extends Thread {
    public void run(){
        for(int i = 1; i<=10; i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
            System.out.print(6*i+" ");
        }
        System.out.println();
    }
}
public class MultiThreadingEx5 {
    public static void main(String[] args) {
        A a = new A();
        
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        a.start();
        b.start();
        
        c.start();
       
        d.start();
        
        e.start();  
    }
}
