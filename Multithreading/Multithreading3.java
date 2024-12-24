class A extends Thread{
    public void run(){
        for(int i = 1; i<=10; i++){
            System.out.print(" child ");
        }
    }
}
public class Multithreading3{
    public static void main(String[] args) {
        A a = new A();
        a.start();
        for (int i = 1; i <= 5; i++) {
            System.out.print(" main thread");
        }
        System.out.println();
    }
}