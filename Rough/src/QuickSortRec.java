import java.util.Arrays;

public class QuickSortRec {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 0, 7};
        qickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void qickSort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int start = lo;
        int end = hi;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        qickSort(arr, lo, end);
        qickSort(arr, start, hi);
    }
}
