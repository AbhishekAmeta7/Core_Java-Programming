import java.io.*;
import java.util.*;
interface  AdvancedArithmetic{
   int divisor_sum(int n); 
}
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int a = 1,ans=0;
        while(a<=n){
            if(n%a==0){
                ans=ans+a;
            }
            a++;
        }
        return ans;
    }
}
public class Solution {

    public static void main(String[] args) {
        MyCalculator my = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(my.divisor_sum(x));
    }
}