public class PatternEx21 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {//2<=4
            for (int s = 1; s<i; s++) {//1<2
                System.out.print("#");
            }
            for (int j = 4; j >=i; j--) {//4>=1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
