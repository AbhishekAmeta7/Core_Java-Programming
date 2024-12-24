class A extends Thread {
    public void run(){
        for (int i = 1; i <= 10; i++) {
            if(i%2 == 0){
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    
                }
                System.out.print(i+" ");
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            if(i%2 != 0){
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    
                }
                System.out.print(i+" ");
            }
        }
    }
}
public class MultiThreadingEx3 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}
