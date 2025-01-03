import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0,sum2 = 0;
        int x = 0, y = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = 0; j < arr.get(i).size(); j++) {
                if(i == j) {
                    sum1 +=arr.get(i).get(j);
                }
            }
        }
        
        for(int i = 0; i < arr.size(); i++) {//2<3
            for(int j = arr.get(i).size()-1-i; j >= 0 ; j--){
                x = i;
                y = j;
                if((x == i && y == j)) {
                    sum2 += arr.get(i).get(j);
                }
                break;
            }
        }
        int total = 0;
        if(sum1>sum2) {
            total = sum1 - sum2;
        }
        else {
            total = sum2 - sum1;
        }
        return total;
    }
}
public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        List<List<Integer>> arr = Arrays.asList(
            Arrays.asList(11, 2, 4),
            Arrays.asList(4, 5, 6),
            Arrays.asList(10, 8, -12)
        );

        int result = Result.diagonalDifference(arr);
        System.out.println("Diagonal Difference: "+result);
    }
}
