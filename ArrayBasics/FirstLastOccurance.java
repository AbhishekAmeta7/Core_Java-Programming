import java.util.*;
class FirstLastOccurance {
    public static int[] searchRange(int[] nums, int target) {
        int[] num = {-1,-1};
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                num[0] = i;
                break;
            }
        }
        for (int i = nums.length-1; i >= 0; i--) {
            if(nums[i] == target) {
                num[1] = i;
                break;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter Target: ");
        int target = sc.nextInt();
        int[] num = searchRange(nums,target);
        // System.out.println(num);
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }
}
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
