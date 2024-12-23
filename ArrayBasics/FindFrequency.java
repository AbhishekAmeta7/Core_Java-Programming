public class FindFrequency {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,2,3,1,7};
        int[] freq = {-1,-1,-1,-1,-1,-1,-1,-1,-1};
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                    freq[j] = 0;
                }
            }
            if(freq[i] != 0){
                freq[i] = count;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(freq[i] != 0){
                System.out.println(arr[i]+" Comes "+freq[i]+" Times");
            }
        }
    }
}