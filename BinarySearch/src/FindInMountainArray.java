public class FindInMountainArray { //1095
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 5, 3, 1};
        int target = 2;
        System.out.println(search(arr, target));
    }

   static int search(int[]arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int searchInAsc = OrderAgnosticBinarySearch(arr, target, 0, peak);
        if (searchInAsc != -1){
            return searchInAsc;
        }
        return OrderAgnosticBinarySearch(arr, target, peak+1, arr.length - 1);
    }

    static int OrderAgnosticBinarySearch(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else if (target > arr[mid]){
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }



    static int peakIndexInMountainArray(int[]arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start +(end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else { // if(arr[mid] < arr[mid + 1])
                start = mid + 1;
            }
        }
        return start;
    }

}
