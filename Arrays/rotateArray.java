public class rotateArray {
    public static void rotate(int[] arr, int d) {
        int len = arr.length;
        for (int i = 0; i < d; i++) {
            int first = arr[0];
            for (int j = 0; j < len - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[len - 1] = first;
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
