import java.util.*;
import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger b1 = new BigInteger(num1);
        BigInteger b2 = new BigInteger(num2);
        BigInteger ans = b1.multiply(b2);
        String result = String.valueOf(ans);
        return result;
    }
}
public class StringsMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String As Number: ");
        String num1 = sc.next();
        System.out.print("Enter 2nd String As Number: ");
        String num2 = sc.next();
        Solution s = new Solution();
        System.out.println(s.multiply(num1,num2));
    }
}
// Input: num1 = "2", num2 = "3"
// Output: "6"
// Example 2:

// Input: num1 = "123", num2 = "456"
// Output: "56088"

// Input: num1 = "6913259244" ,  num2 = "71103343"
// Output: "491555843274052692"