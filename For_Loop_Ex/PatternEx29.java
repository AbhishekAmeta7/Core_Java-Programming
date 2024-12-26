public class PatternEx29 {
    public static void main(String[] args) {
        int x = 9;
        int y = 1;
        for (int i = 0; i < 5; i++) {
            int a = i;//1
            for(int j = 1; j <= 5; j++) {
                if(j%2 != 0) {//
                    a += y; //
                    System.out.print((a-(i*2))+" ");
    
                }
                else {
                    a += x;
                    System.out.print((a-(i*2))+" ");
                }
            }
            x -= 2;
            y += 2;
            System.out.println();
        }
    }
}

// 1 10 11 20 21   
// 2 9  12 19 22  
// 3 8  13 18 23   
// 4 7  14 17 24   
// 5 6  15 16 25  