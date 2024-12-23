import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(21);
        al.add(22);
        al.add(22);
        al.add(23);
        System.out.println("first index of 22 is: " +al.indexOf(22));
    }
}
