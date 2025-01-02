import java.util.Scanner;

public class HappyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Test Cases: ");
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            System.out.print("Enter String "+i+": ");
            String s = sc.next();
            char[] ch = s.toCharArray();
            int count = 0;
            for(int j = 0; j < ch.length; j++){
                if(ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u') {
                    count++;
                    if(count > 2) {
                        break;
                    } 
                }
                else {
                    count = 0;
                }
            }
            if(count>2) {
                System.out.println("Happy");
            }
            else{
                System.out.println("Sad");
            }
        }
    }
}
// 4
// aeiou          Happy
// abxy           Sad
// aebcdefghij    Sad    
// abcdeeafg      Happy


// Test case 1: Since the string aeiou is a contiguous substring and consists of all vowels and has a length>2, Chef is happy.

// Test case 2: Since none of the contiguous substrings of the string consist of all vowels and have a length>2, Chef is sad.

// Test case 3: Since none of the contiguous substrings of the string consist of all vowels and have a length>2, Chef is sad.

// Test case 4: Since the string eea is a contiguous substring and consists of all vowels and has a length>2, Chef is happy.