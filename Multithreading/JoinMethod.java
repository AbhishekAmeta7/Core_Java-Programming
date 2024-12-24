class A extends Thread {
    public void run() {
        for(int i = 1; i<=3; i++){
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                
            }
            System.out.print(i+" ");
        }
    }
}
public class JoinMethod {
    public static void main(String[] args) {
        A a1 = new A();
        a1.start();
        try {
            a1.join();
        } catch (InterruptedException e) {
            
        }
        A a2 = new A();
        a2.start();
    }
}