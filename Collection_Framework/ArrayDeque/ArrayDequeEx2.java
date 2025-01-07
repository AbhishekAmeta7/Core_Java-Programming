import java.util.*;
public class ArrayDequeEx2 {
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>();
        ad.add("India");
        ad.add("USA");
        ad.add("UK");
        ad.add("Nepal");
        ad.add("Russia");

        for (String s : ad) {
            System.out.print(s+" ");
        }
    }
}
