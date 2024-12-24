public class ThreadPriority1 extends Thread {
    public void run() {
        System.out.println("Child Thread");
        System.out.println("Child Thread Priority: "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        System.out.println("Main Thread Old Prioroty: "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("Main Thread New Prioroty: "+Thread.currentThread().getPriority());

        ThreadPriority t = new ThreadPriority();
        t.setPriority(3);
        t.start();
    }    
}
