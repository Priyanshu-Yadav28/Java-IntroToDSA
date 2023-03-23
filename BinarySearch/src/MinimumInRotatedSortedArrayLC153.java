public class MinimumInRotatedSortedArrayLC153 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2};
        System.out.println(minimumInRotatedSortedArray(arr));
    }
    static int minimumInRotatedSortedArray(int[] nums){
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
            if (nums[mid] <= nums[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return nums[0];
    }
}
// in this question we have to find the min element in the rotated sorted array so here ive used
// the logic of pivot or the peak element , in general when we have to find pivot that is the max element
// we see that the array is in increasing order everywhere only at the pivot index and pivot + 1 index it
// is in descending order so ive used opposite concept of pivot. for pivot we have to see that mid > mid +1
// if yes return mid, or if mid < mid - 1 return mid - 1 because here mid -1 will be the pivot
// as the last descending index is mid and if the greater number will be at index mid - 1 from it
// it wil be pivot only .
//here to find the  minimum number we have done opposite of this concept
// we are returning (mid + 1) if mid > [mid + 1] and mid when mid < mid - 1;
