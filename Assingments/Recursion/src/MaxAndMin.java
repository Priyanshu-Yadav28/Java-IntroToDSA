import java.util.ArrayList;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 7, 10};
        ans(arr);
    }
    static void ans(int[] arr) {
        int i = 0;
        int ans1 =  max(arr, i, 0);
        int ans2 = min(arr, i, arr[0]);
        System.out.println(ans1 +" " +ans2);
    }
    static int max(int[] arr, int i, int max) {
        if (i == arr.length) {
            return max;
        }
        if (arr[i] > max) {
            max = arr[i];
        }
        return max(arr, i + 1, max);
    }

    static int min(int[] arr, int i, int min) {
        if (i == arr.length) {
            return min;
        }
        if (arr[i] < min) {
            min = arr[i];
        }
        return min(arr, i + 1, min);
    }

}
