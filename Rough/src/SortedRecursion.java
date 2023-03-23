public class SortedRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8, 10, 14, 18, 91};
        System.out.println(isSorted(arr, 0));
    }


    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
//        return arr[index] < arr[index + 1] && helper(arr, index + 1);
        if (arr[index] < arr[index + 1]) {
            return isSorted(arr, index +1);
        }
        return false;
    }
}

