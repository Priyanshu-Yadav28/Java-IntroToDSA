public class SearchInsertPositionLC35 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 2;
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == nums[mid]){
                return mid;
            }
            if (target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}
