public class secondlargestelement {
    private static int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;
        int len = arr.length;

        //finding the largest element
        for (int i = 0; i < len; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // finding the second largest element and ignoring the largest one
        for (int j = 0; j < len; j++) {
            if (arr[j] > secondLargest && arr[j] != largest) {
                secondLargest = arr[j];
            }
        }
        
        return secondLargest;
    }
    public static void main(String args[]) {
        int[] sampleArray = {2, 1, 26, 7,22, 4};
        int result = getSecondLargest(sampleArray);

        System.out.println("Second Largest Element of Array: " + result);
    }
}