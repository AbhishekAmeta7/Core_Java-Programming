public class String_splitMethod {
    public static void main(String[] args) {
        String s = "Java,Python,JavaScript";
        String[] s1 = s.split(",");
        for (String s2 : s1) {
            System.out.println(s2);
        }
    }
}
