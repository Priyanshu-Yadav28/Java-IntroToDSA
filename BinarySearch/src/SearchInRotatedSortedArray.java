public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2}; // Originally it was sorted as[0, 1, 3, 4, 5, 6, 7]
        // after rotating it once 7 came at index 0
        // after rotating it second time 6 came on 0 and 7 went to 1
        // after rotating it for the third time 5 came on 0 position and the element aftr that shifted to +1 index
        // after the 4th rotation 4 came on the 0 index.
        // originally the array was sorted in ascending orde[0, 1, 2, 4, 5, 6, 7]
        // Rotation No.                       changes in array
        //    1                             [7, 0, 1, 2, 4, 5, 6]
        //    2                             [6, 7, 0, 1, 2, 4, 5]
        //    3                             [5, 6, 7, 0, 1, 2, 4]
        //    4                             [4, 5, 6, 7, 0, 1, 2]
        // so in this question we have to first find PIVOT (maximum element in the array)
        // and then we have to apply BS in LHS and RHS of the pivot to search for the element.
        int target = 7;
//        System.out.println(findPivot(nums));
        System.out.println(search(nums, target));
    }
    static int search(int[] nums, int target){
        int pivot = findPivot(nums);
        // if you did not find a pivot that means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        //if Pivot is found you have found 2 ascending sorted arrays
        if (nums[pivot] == target){ // case 1
            return pivot;
        }
        if (target >= nums[0]){
            return binarySearch(nums, target, 0, pivot - 1); // pivot - 1 because if pivot == target  it wil be caughe in case 1
        }
        // if(target < nums[0])
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
    // this will not work for duplicate values in the array
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            // 4 cases over here to find the pivot element were:
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else { // if(arr[mid] > arr[start// ])
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
