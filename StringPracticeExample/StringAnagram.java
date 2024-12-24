import java.util.*;
public class StringAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String s2 = sc.nextLine();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int count=0;
        for(int i = 0; i < ch1.length; i++){
            for(int j = 0; j < ch1.length; j++){
                if(ch1[i]==ch2[j]){
                    count++;
                    break;
                }
            }
        }
        if((count==ch1.length) && (count == ch2.length)){
            System.out.println("String is anagram");
        }
        else{
            System.out.println("String is not anagram");
        }
    }
}
