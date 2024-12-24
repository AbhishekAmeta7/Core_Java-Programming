public class Palindrome_Number{
    public static void main(String[] args) {
        
        int num = 12321,a = 0 , ans=0;
        int temp = num;
        while(num>0 ){
            a = num%10;
            ans = ans*10+a;
            num=num/10;
        }
        if(temp==ans){
            System.out.println(temp+" is Palindrome number");
        }
        else{
            System.out.println(temp+" is Not Palindrome number");
        }
    }
    
}
