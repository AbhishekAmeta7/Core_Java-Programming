import java.util.Scanner;
class Solution {
    public void rotate(int[][] matrix) {
        int[][] mat = new int[matrix.length][matrix.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = matrix[j][i];
            }
        }
        System.out.println();
        for (int i = 0; i < mat.length; i++) {
            for (int j = mat[i].length-1; j >= 0 ; j--) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class RotateImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. Of Rows: ");
        int n = sc.nextInt();
        System.out.print("Enter No. Of Columns: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Solution s = new Solution();
        s.rotate(arr);
    }
}
// 1 2 3        7 4 1
// 4 5 6        8 5 2
// 7 8 9        9 6 3