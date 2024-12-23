public class Pattern28 {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++) {
            if(i==3){
                for(int  j = 1; j <= i-1; j++) {
                    System.out.print("*");
                }
            }
            else{
                for(int  j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            
            System.out.println();
        }
    }
}