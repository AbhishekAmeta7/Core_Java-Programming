class A extends Thread{
    public void run(){
        for(int i = 1; i<=10; i++){
            System.out.print(i*2+" ");
        }
    }
}
public class Multithreading1{
    public static void main(String[] args) {
        A a = new A();
        a.start();
    }
}