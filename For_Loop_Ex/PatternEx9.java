public class PatternEx9 {
    public static void main(String[] args) {
     for (int i = 1; i <=5; i++) {//1<=5
        for (int s = 4; s>=i; s--) {//4>=1
            System.out.print(" ");
        }
        for (int j = 1; j <=i; j++) {
            System.out.print(" *");
        }
        System.out.println();
     }   
    }
}
