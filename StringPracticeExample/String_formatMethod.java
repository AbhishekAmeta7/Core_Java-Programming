public class String_formatMethod {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 25;
        double height = 5.7;

        String f = String.format("Name: %s\nAge: %d\nHeight: %.1f", name, age, height);
        System.out.println(f);
    }
}
