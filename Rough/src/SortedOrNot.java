public class SortedOrNot {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 5, 8, 9 , 23};
        boolean ans = sorted(nums);
        System.out.println(ans);
    }

    static boolean sorted(int[] arr) {
        return helper(arr, 0);
    }

    static boolean helper(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] < arr[i + 1]) {
            return helper(arr, i + 1);
        }
        return false;
    }
}
