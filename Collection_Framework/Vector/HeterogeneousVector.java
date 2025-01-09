import java.util.*;
public class HeterogeneousVector {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement("Java");
        v.addElement(50);
        v.addElement('A');
        v.addElement(true);
        v.addElement("Kotlin");

        Iterator itr = v.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
}
