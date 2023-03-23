public class MountainArrayPeakIndex {
    // Mountain array = first increase then the value in the array starts decreases
    // also known as bitonic array. example
    //                                  7
    //                               5     6
    //                            4          3
    //                          3              2
    //                        2                  1`
    //                      1
    // and we have to find the peak element of this array. Here the peak element is 7
    // so we have to find the peak element of the mountain array.
    //*****************************************************************************
    // THIS CODE WILL ALSO BE VALID FOR NUMBERS IN ARRAY OCCURRING MORE THAN ONCE
    //*****************************************************************************
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 6, 7, 0, 1};
        System.out.println(peakElement(arr));
    }
    static int peakElement(int[] nums){
        int start = 0;
        int end = nums.length -1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]){
                end = mid;
            }else{ // if arr[mid] < arr[mid + 1]
                start = mid + 1;
            }
        }
        return start;
    }
}
