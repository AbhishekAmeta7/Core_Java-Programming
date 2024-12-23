public class DeepCopy {
    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = a.clone();
        System.out.println("Original Array: ");
        printArray(a);
        System.out.println("Duplicate Array: ");
        printArray(b);
        a[0] = 67;
        a[1] = 78;
        System.out.println("Changes Original Array: ");
        printArray(a);
        System.out.println("Changes Duplicate Array: ");
        printArray(b);        
    }
}
