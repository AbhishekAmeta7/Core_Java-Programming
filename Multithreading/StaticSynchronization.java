class BookTheaterSeat {
    static int totalSeats = 20;
    public static synchronized void book_Sead(int seats) {
        if(totalSeats >= seats) {
            System.out.println(seats+" Seats Booked Successfully");
            totalSeats = totalSeats - seats;
            System.out.println("Left Seats: "+totalSeats);
        }
        else {
            System.out.println("Seats Cannot Be Booked");
            System.out.println("Left Seats: "+totalSeats);
        }
    }
}
class MyThread1 extends Thread {
    BookTheaterSeat b;
    int seats;
    MyThread1(BookTheaterSeat b , int seats) {
       this.b = b;
       this.seats = seats; 
    }
    public void run() {
        b.book_Sead(seats);
    }
} 
class MyThread2 extends Thread {
    BookTheaterSeat b;
    int seats;
    MyThread2(BookTheaterSeat b , int seats) {
        this.b = b;
        this.seats = seats;
    }
    public void rin() {
        b.book_Sead(seats);
    }
}
public class StaticSynchronization {
    public static void main(String[] args) {
        BookTheaterSeat b1 = new BookTheaterSeat();
        MyThread1 t1 = new MyThread1(b1, 7);
        t1.start();
        MyThread2 t2 = new MyThread2(b1, 6);
        t2.start();

        BookTheaterSeat b2 = new BookTheaterSeat();
        MyThread1 t3 = new MyThread1(b2, 5);
        t3.start();
        MyThread2 t4 = new MyThread2(b2, 9);
        t4.start();

        
    }
}
