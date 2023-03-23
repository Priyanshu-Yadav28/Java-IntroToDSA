import java.util.Arrays;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        int target = 1;
        int ans = searchRotated(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }
    static int searchRotated(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (arr[s] <= arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {
                return searchRotated(arr, target, s, mid - 1);
            } else {
                return searchRotated(arr, target, mid + 1, e);
            }
        }
        if (target >= arr[mid] && target <= arr[e]) {
            return searchRotated(arr, target, mid + 1, e);
        }
        return searchRotated(arr, target, s, mid - 1);

    }
}
