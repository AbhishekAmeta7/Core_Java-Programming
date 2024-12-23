import java.util.Scanner;
class TicketBooking{
    private int available;
    private String name;
    private int noOfTicket;
    TicketBooking(int available,String name){
        this.available = available;
        this.name=name;
    }
    

    void booking(int noOfTicket){
        this.noOfTicket=noOfTicket;
        if(noOfTicket<=70 && available>0){
            available = available-noOfTicket;
            System.out.println(noOfTicket+" Ticket Booked");
        }
        else{
            System.out.println("All tickets have been booked!");
        }
    }void canceling(int noOfTicket){
        this.noOfTicket=noOfTicket;
        int no = noOfTicket;
            if(noOfTicket<=no){
                available = available+noOfTicket;
            System.out.println(noOfTicket+" Ticket Cancelled!");
        }
        else{
            System.out.println("Enter Valid input");
        }
    }
    int viewing(){
        return available;
    }
}
public class TicketBookingSystem {
    public static void main(String[] args) {
        System.out.println("b-->Booking\nc-->Cancelling\nv-->Viewing\ne-->Exit");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        TicketBooking t = new TicketBooking(70, name);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Choice: ");
            char ch = sc.next().charAt(0);
            switch (ch) {
                case 'b':
                  
                    System.out.print("How many tickets would you like to book: ");
                    int noOfTicket = sc.nextInt();
                    t.booking(noOfTicket);
                    break;
                case 'c':
                System.out.print("How many tickets would you like to cancle: ");
                noOfTicket = sc.nextInt();
                    t.canceling(noOfTicket);
                    break;
                case 'v':
                   System.out.println("Available tickets: "+t.viewing());  
                   break;
                case 'e':
                   System.exit(0);     
                default:
                System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
// 16.Design a class `TicketBooking` for a cinema 
// that allows booking, canceling, and viewing tickets.
// Demonstrate how encapsulation is used to protect ticket availability.