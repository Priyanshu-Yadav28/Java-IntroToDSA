import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 7};
        sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int last, int col) {

        if (last == 0) {
            return;
        }

        if (col < last) {

            if (arr[col] > arr[col + 1]) {

                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
        }

            sort(arr, last, col + 1);
        }
        else {
            sort(arr, last - 1, 0);
        }
    }

}
