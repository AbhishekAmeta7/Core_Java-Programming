import java.util.*;

class Book {
    String publisher;
    String name;
    int quantity;
    String book_Name;

    // Constructor
    Book(String publisher, String name, int quantity, String book_Name) {
        this.publisher = publisher;
        this.name = name;
        this.quantity = quantity;
        this.book_Name = book_Name;
    }
}

public class UserDefineGenericTreeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of TreeSet: ");
        int n = sc.nextInt(); 
        sc.nextLine(); 

        TreeSet<Book> ts = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");

            System.out.print("Enter Publisher: ");
            String publisher = sc.nextLine(); 

            System.out.print("Enter Author Name: ");
            String name = sc.nextLine(); 

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt(); 
            sc.nextLine(); 

            System.out.print("Enter Book Name: ");
            String book_Name = sc.nextLine(); 

            Book b1 = new Book(publisher, name, quantity, book_Name);
            ts.add(b1);
        }

        System.out.println("------- Book Details -------");
        for (Book b : ts) {
            System.out.println(
                "Publisher: " + b.publisher +
                ", Author: " + b.name +
                ", Quantity: " + b.quantity +
                ", Book Name: " + b.book_Name
            );
        }
    }
}
