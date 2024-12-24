class A extends Thread {
    public void run(){
        for (int i = 1; i <= 3; i++) {
         try {
            Thread.sleep(100);
         } catch (Exception e) {}
         System.out.print(i+" ");   
        }
        System.out.println();
    } 
}
class B extends Thread {
    public void run(){
        for (int i = 4; i <= 6; i++) {
         try {
            Thread.sleep(100);
         } catch (Exception e) {}
         System.out.print(i+" ");   
        }
        System.out.println();
    } 
}
class C extends Thread {
    public void run(){
        for (int i = 7; i <= 9; i++) {
         try {
            Thread.sleep(100);
         } catch (Exception e) {}
         System.out.print(i+" ");   
        }
        System.out.println();
    } 
}
class D extends Thread{
    public void run(){
        for (int i = 10; i <= 12; i++) {
         try {
            Thread.sleep(100);
         } catch (Exception e) {}
         System.out.print(i+" ");   
        }
        System.out.println();
    } 
}
public class MultiThreadingEx2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        a.start();
        b.start();
        c.start();
        d.start();
    }
}
