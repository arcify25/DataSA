public class thirdlargestelement {
    public static int getThirdLargestElement(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (arr[i] > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            } else if (arr[i] > thirdLargest) {
                thirdLargest = arr[i];
            }
        }

        return thirdLargest;
    }
    
    public static void main(String args[]){
        int[] sampleArray = {2, 1, 26, 7, 22, 25, 4};
        int result = getThirdLargestElement(sampleArray);

        System.out.println("Third Largest Element of Array: " + result);
    }
}
