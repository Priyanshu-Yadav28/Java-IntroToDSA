import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2};
        swap(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }
}
