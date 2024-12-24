class A extends Thread {
    public void run(){
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("hello world\n"+"welcome to india ");
        }
    }
}
public class MultiThreadingEx4 {
    public static void main(String[] args) {
        A p = new A();
        p.start();   
    }
}
