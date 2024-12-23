class A{
    static void show(int age){
        if(age<=18){
            throw new ArithmeticException("Not Valid For Vote");
        }
        else{
            System.out.println("Valid For Vote");
        }
    }
}
public class ThrowCase6 {
    public static void main(String[] args) {
        A.show(17);
    }
}
