class A extends Thread {
    public void run(){
        for(int i = 1; i<=10; i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
            System.out.print(i*2+" ");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 1; i<=10; i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
            System.out.print(i*3+" ");
        }
    }
}
public class MultiThreadingEx6 {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        a1.start();
        b1.start();
    }
}
