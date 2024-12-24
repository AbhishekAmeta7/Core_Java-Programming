public class String_toCharArrayMethod {
    public static void main(String[] args) {
        String s = "Programming";
        char[] ch = s.toCharArray();
        for (char c : ch) {
            System.out.print(c+" ");
        }
    }
}
