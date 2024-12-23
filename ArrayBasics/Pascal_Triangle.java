import java.util.Scanner;
public class Pascal_Triangle{
    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] pascal(int n){
        int ans[][] = new int[n][];
        //for Rows Loop
        for (int i = 0; i < n; i++) {
            //for Rows Column
            ans[i] = new int[i+1];
            ans[i][0] = 1;
            ans[i][i] = 1;
            //Columns
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int pascal[][] = pascal(n);
        printArray(pascal);
    }
}