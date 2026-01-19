public class maximumProductofaTriplet {
    static int getProduct(int[] arr) {
       
        int len = arr.length;

        int maxA = Integer.MIN_VALUE, maxB = Integer.MIN_VALUE, maxC = Integer.MIN_VALUE;

        int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {
            
            // Find Maximum 3 Elements
            if (arr[i] > maxA) {
                maxC = maxB;
                maxB = maxA;
                maxA = arr[i];
            } else if (arr[i] > maxB) {
                maxC = maxB;
                maxB = arr[i];
            } else if (arr[i] > maxC) {
                maxC = arr[i];
            }
            // Find Minimum Elements
            if (arr[i] < minA) {
                minB = minA;
                minA = arr[i];
            } else if (arr[i] < minB) {
                minB = arr[i];
            }   
        }
       return Math.max(minA * minB * maxA, maxA * maxB * maxC);
    }
    
    public static void main(String args[]) {
        int[] sampleArray = { 10, -3, 26, 7, -10 };
        System.out.println("Maximum Product of Array: " + getProduct(sampleArray));
    }
}
