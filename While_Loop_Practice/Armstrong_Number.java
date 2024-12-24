public class Armstrong_Number {
    public static void main(String[] args) {
        
        int num = 153,a = 0 , ans=0;
        int temp = num;
        while(num>0 ){
            a = num%10;
            ans = ans+a*a*a;
            num=num/10;
        }
        if(temp==ans){
            System.out.println(temp+" is Armstrong number");
        }
        else{
            System.out.println(temp+" is Not Armstrong number");
        }
    }
}
