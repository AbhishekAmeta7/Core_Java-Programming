public class PatternEx13 {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            for (int s =0; s<=i ; s++) {
                System.out.print(" ");
            }
            for (int j = 5; j >=i ; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 1; i <=5; i++) {//1<=5
            for (int s = 6; s>=i; s--) {//4>=1
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
         }   
    }
}
