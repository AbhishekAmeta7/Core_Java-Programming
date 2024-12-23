import java.util.*;
public class SortEvenOddTwoPointer {
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void sortEvenOdd(int[] a) {
        int left = 0;
        int right = a.length-1;
       
        while(left <= right){
                if(a[left]%2==0){
                    left++;
                }
                if(a[right]%2!=0){
                    right--;
                }
                if(a[left]%2!=0 && a[right]%2==0){
                    swap(a,left,right);
                    left++;
                    right--;
                }
        }
        printArray(a);
    }
    public static void swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Variable: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sortEvenOdd(a);
    }
}