public class MinimumInDuplicateRotatedSortedArrayLC154 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 0, 1};
        System.out.println(minimumInDuplicateRotatedSortedArray(arr));
    }
    static int minimumInDuplicateRotatedSortedArray(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]){
                return nums[mid + 1];
            }
            if (mid > start && nums[mid] < nums[mid - 1]){
                return nums[mid];
            }
            if (nums[start] == nums[mid] && nums[mid] == nums[end]){
                if (nums[start] > nums[start + 1]){
                    return nums[start + 1];
                }
                start ++;
                if (nums[end] < nums[end - 1]){
                    return nums[end];
                }
                end--;
            }
            else if (nums[mid] > nums[start] || nums[start] == nums[mid] && nums[end] < nums[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        return nums[0];
    }
}
