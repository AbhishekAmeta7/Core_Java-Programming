import java.util.ArrayList;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {2,6,10,12,18,14,22,26,30,34,38,42,46,50,52};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++){
                for(int k = j+1; k < arr.length; k++) {
                    if((arr[i]+arr[j]+arr[k])==60) {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        break;
                    }
                }
            }
        }
                 
    }
}
