public class reverseAnArrayInGroups {
    
    public static void reverseInGroups(int[] arr, int k) {
        int len = arr.length;
        
        for (int i = 0; i < len; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, len - 1);

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    
    public static void main(String args[]) {
        int sampleArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3;
        reverseInGroups(sampleArray, k);
        
        for (int i = 0; i < sampleArray.length; i++) {
            System.out.print(sampleArray[i] + " ");
        }
    }
}