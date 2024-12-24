public class Neon_Number {
    public static void main(String[] args) {
        
        int num = 9,ans = 0,a=0;
        int sqr = num*num;
        while(sqr>0 ){
          a = sqr%10;
          ans = ans+a;
          sqr=sqr/10;
        }
        if(ans==num){
            System.out.println(num+" is Neon Number");
        }
        else{
            System.out.println(num+" is Not Neon Number");
        }
    }
}
