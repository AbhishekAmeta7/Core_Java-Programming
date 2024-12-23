import java.util.*;
class Voter extends RuntimeException {
    public Voter(String s) {
        System.out.println(s);
    }
}

class Check {
    static void voterId(int age) {
        if (age < 18) {
            throw new Voter("you are not eligible");
        } else {
            System.out.println("you are valid for vote");
        }
    }
}

public class CustomizedException1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        Check.voterId(age);
    }
}
