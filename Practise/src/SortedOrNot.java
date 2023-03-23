public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8, 10, 13, 21};
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr) {
        int index = 0;
        return helper(arr, index);
    }
    static boolean helper(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && helper(arr, index + 1);
    }
}
