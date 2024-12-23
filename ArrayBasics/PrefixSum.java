import java.util.*;
public class PrefixSum{
    public static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static int[] prefixsum(int a[]){
        int n = a.length;
        int pre[] = new int[n];
        pre[0] = a[0];
        for(int i = 1; i < n; i++){
            pre[i] = pre[i - 1] + a[i];
        }
        return pre;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int prefix[] = prefixsum(a);
        printArray(prefix);
    }
}