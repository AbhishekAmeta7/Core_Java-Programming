import java.util.Scanner;
public class StringCodeChef1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        for(int j = 0; j < T; j++) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] ch = s.toCharArray();
            n = ch.length;
            for(int i = 0; i < n-1; i+=2){
                if(ch[i]=='0' && ch[i+1]=='0'){
                    System.out.print("A");
                }
                else if(ch[i]=='0' && ch[i+1]=='1'){
                    System.out.print("T");
                }
                else if(ch[i]=='1' && ch[i+1]=='0'){
                    System.out.print("C");
                }
                else if(ch[i]=='1' && ch[i+1]=='1'){
                    System.out.print("G");
                }
            }
            System.out.println();
        }
    }
}
// 00 is replaced with A
// 01 is replaced with T
// 10 is replaced with C
// 11 is replaced with G


//Input            Output
// 4             
// 2
// 00              A
// 4
// 0011            AG
// 6
// 101010          CCC
// 4
// 1001            CT
