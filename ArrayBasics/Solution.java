import java.util.*;
public class Solution  {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length+nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            nums3[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            nums3[nums1.length + i] = nums2[i];
        }
        Arrays.sort(nums3);
        int mid = 0;
        double result = 0;
        if((nums3.length)%2 == 0) {
            mid = (0+nums3.length)/2;
            result = nums3[mid-1]+nums3[mid];
            result = result/2.0;
        }
        else{
            mid = (0+nums3.length)/2;
            result = nums3[mid];
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of 1st Array: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter 1st Array Element");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.print("Enter Size Of 2nd Array: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter 2nd Array Element");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
} 
// [1,2,3] = 2
// [1,2,3,4] = 2+3/2 => 2.5