import java.util.Arrays;
import java.util.Scanner;
public class StringAnagram1 {
    public static boolean isAnagram(String s1 , String s2){
        char[] ch1 = s1.toLowerCase().toCharArray();
        char[] ch2 = s2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(ch1.length != ch2.length){
            return false;
        }
        else{
           int count = 0;
           for(int i = 0; i < ch1.length; i++){
               for(int j = i; j <= i; j++){
                   if(ch1[i] == ch2[j]){
                       count++;
                       break;
                   }
               }
           }
           boolean b = false;
          if((count==ch1.length) && (count==ch2.length)){
              b = true;;
          }
          return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String s2 = sc.nextLine();
        boolean b = isAnagram(s1 , s2);
        if(b == true){
            System.out.println("String Is Anagram");
        }
        else{
            System.out.println("String Is Not Anagram");
        }
    }
}
