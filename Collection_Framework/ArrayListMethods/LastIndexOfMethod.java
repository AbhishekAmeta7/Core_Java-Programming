import java.util.ArrayList;
public class LastIndexOfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(21);
        al.add(22);
        al.add(22);
        al.add(23);
        System.out.println("Last index of 22 is: " +al.lastIndexOf(22));
    }
}
