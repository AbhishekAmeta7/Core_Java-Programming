import java.util.*;
class Solution {
    public int strStr(String haystack, String needle) {
        int n = 0;
        if(haystack.contains(needle)) {
            n = haystack.indexOf(needle);
        }
        else{
            n = -1;
        }
        return n;
    }
}
public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of haystack: ");
        String haystack = sc.next();
        System.out.print("Enter Value: ");
        String needle = sc.next();
        Solution solve = new Solution();
        System.out.println(solve.strStr(haystack,needle));
    }
}
// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Example 2:

// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", 
// so we return -1.
