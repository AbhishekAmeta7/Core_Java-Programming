import java.util.Scanner;
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean b = false;
        int count1 = 0, count2 = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i]<=nums[j]) {
                    count1++;
                }
                break;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] >= nums[j]) {
                    count2++;
                }
                break;
            }
        }
        
        if((count1==nums.length-1) || (count2==nums.length-1)) {
            b = true;
        }
        return b;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        Solution so = new Solution();
        System.out.println(so.isMonotonic(nums));
    }
}
// Input: nums = [1,2,2,3]
// Output: true

// Example 2:
// Input: nums = [6,5,4,4]
// Output: true

// Example 3:
// Input: nums = [1,3,2]
// Output: false