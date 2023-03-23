import java.util.Arrays;

public class BsortRecursion {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 4};
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int last, int col) {
        if (last == 0) {
            return;
        }
        if (col < last) {
            if (arr[col] > arr[col + 1]){
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubbleSort(arr, last, col + 1);
        }
        else {
            bubbleSort(arr, last -1, 0);
        }
    }
}
