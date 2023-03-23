public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {2, 8, 7, 9, 11, 1, 21, 28};
        System.out.println(position(arr, 1));
//        System.out.println(isPresent(arr, 7, 0));

    }
    static int position(int[] arr, int target) {
        int index = 0;
        return helper(arr, index, target);
    }

    static int helper(int[] arr, int index, int target) {
        if (index == arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return helper(arr, index + 1, target);
    }


    static boolean isPresent(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return false;
        }

        if (arr[index] == target) {
            return true;
        }
        return isPresent(arr, target, index + 1);
    }
}
