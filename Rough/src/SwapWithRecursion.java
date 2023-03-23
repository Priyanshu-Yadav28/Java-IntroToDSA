import java.util.Arrays;

public class SwapWithRecursion {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2};
        swap(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] arr, int start, int last) {
        if (start > last) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
        swap(arr, start + 1, last - 1);
    }
}
