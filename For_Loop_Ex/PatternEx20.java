public class PatternEx20 {
    public static void main(String[] args) {
        for (int i = 1; i <=4; i++) {//1<=4
            for(int s = 3 ; s>=i; s-- ){//3>1
                System.out.print("#");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
