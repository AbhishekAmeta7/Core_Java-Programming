public class String_getCharMethod {
    public static void main(String[] args) {
        String s = "Java Programming";
        char[] ch ={'1','2','3','4','5','6','7','8','9'};
        System.out.println(ch);
        s.getChars(3, 8, ch, 4);
        System.out.println(ch);
    }
}
