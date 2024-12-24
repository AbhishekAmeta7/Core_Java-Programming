public class Reverse_Number{
    public static void main(String[] args) {
        int num = 657,a = 0 , ans=0;
                while(num>0 ){
                    a = num%10;
                    ans = ans*10+a;
                    num=num/10;
                }
                System.out.println(ans);
    }
}