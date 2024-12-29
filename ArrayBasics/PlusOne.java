import java.util.*;
import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {//1 2 3
        StringBuilder numberStr = new StringBuilder();
        for (int digit : digits) {
            numberStr.append(digit); 
        }
        BigInteger bigInteger = new BigInteger(numberStr.toString());
        bigInteger = bigInteger.add(BigInteger.ONE);
        String s = bigInteger.toString();
        char[] ch = s.toCharArray();
        int[] digit = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            digit[i] = ch[i] - '0';
        }

        return digit;
    }
}
class PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int[] digit = new int[n];
        for(int i = 0; i < n; i++) {
            digit[i] = sc.nextInt();
        }
        Solution s = new Solution();
        int[] plusone = s.plusOne(digit);
        for (int i : plusone) {
            System.out.print(i+" ");
        }
    }
}
// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].
// Example 2:

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].
// Example 3:

// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].


// [9,8,7,6,5,4,3,2,1,0]

// Use Testcase
// Output
// [1,2,8,6,6,0,8,6,1,9]
// Expected
// [9,8,7,6,5,4,3,2,1,1]

// [7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6]

// Use Testcase
// Output
// [3,3,9,0,7,4,1,6,1,9,1,5,4,4,7,6,6,6,3]
// Expected
// [7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,7]