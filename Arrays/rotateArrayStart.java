public class rotateArrayStart {
    public static void rotate(int[] arr, int d) {
        int len = arr.length;
        d = d % len;
        for (int i = 0; i < d; i++) {
            int last = arr[len - 1];
            for (int j = len - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 3;

        rotate(arr, d);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
