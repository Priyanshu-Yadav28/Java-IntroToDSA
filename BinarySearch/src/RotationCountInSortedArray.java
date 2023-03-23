public class RotationCountInSortedArray {
    // this program conts the number of rotation in the array.
    // if you want to count the rotation with duplicate elements we can use
    // find pivot with duplicate elements fuction
    // or with same elements we can use simple function to find pivot.
    public static void main(String[] args) {
        int[] arr = {4, 4, 5, 6, 7, 8, 8, 0, 1,  1, 2, 3, 3};
        System.out.println(rotationCount(arr));
//        System.out.println(rotationCount(arr));
    }
    static int rotationCount(int[] arr){
        int pivot = findPivotInDuplicate(arr);
//        if (pivot == -1){
//            return 0;
//        } // we can remove this because if pivot == - 1 in line 16 -1 + 1 = 0
        // which will be the correct ans.
        return pivot + 1;
    }
    static int findPivotInDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // if element at middle, start and end are equal then just skip the duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted so pivot should be in right
            else if (arr[mid] > arr[start] || arr[start] == arr[mid]&& arr[end] < arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
