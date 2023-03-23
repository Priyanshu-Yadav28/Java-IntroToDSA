public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8};
        System.out.println(sorted(arr));
    }
    static boolean sorted(int[] arr){
        int index = 0;
        return helper(arr, index);
    }

    static boolean helper(int[] arr, int index) {
        if (index == arr.length -1) {
            return true;
        }
        return arr[index] < arr[index + 1] && helper(arr,index + 1);
    }
}
