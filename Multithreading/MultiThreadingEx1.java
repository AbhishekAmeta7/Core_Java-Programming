class A extends Thread {
    public void run(){
        for (int i = 1; i <= 4; i++) {
            System.out.print(i+" ");
        }
    }
}
public class MultiThreadingEx1 {
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        a1.start();
        a2.start();
        a3.start();
        a4.start();
    }
}