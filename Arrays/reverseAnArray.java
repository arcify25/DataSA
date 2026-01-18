public class reverseAnArray {
    public static void reverseArray(int[] arr) {
        int len = arr.length;
        int temp = 0;
        for (int i = 0; i < len / 2; i++) {
            temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
    }
    
    public static void main(String args[]) {
        int sampleArray[] = { 5, 4, 3, 2, 1 };
        reverseArray(sampleArray);
        
        for (int i = 0; i < sampleArray.length; i++) {
            System.out.print(sampleArray[i] + " ");
        }
    }
}
