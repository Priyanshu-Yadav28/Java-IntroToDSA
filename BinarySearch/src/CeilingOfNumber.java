public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 9, 14, 16, 18};
        int target = 17;
        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[arr.length - 1]){
            return -1;
        }
        while (start <= end){
            int mid = start +(end - start) / 2;
            if (target == arr[mid]){
                return arr[mid];
            }
            if (target > arr[mid]){
                start = mid + 1;
            }
            if (target < arr[mid]){
                end = mid - 1;
            }
        }
        return arr[start];
    }

}
