import java.util.Arrays;

public class Rough {
    //practise of start and end positon of element in an sorted array using Binary
    // search(log n) and linear search(log n) both
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 7, 7, 8, 8, 8, 8, 8, 10, 10, 12, 12};
        int target = 5;
        System.out.println(Arrays.toString(search(arr, target)));
//        System.out.println(Arrays.toString(linearSearch(arr, target)));
    }

    static int[] search(int[]arr, int target){
        int[] ans = {-1, -1};
        int start = bs(arr, target, true);
        int end = bs(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int bs(int[] arr, int target, boolean findStart){
        int ans = -1;

        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                ans = mid;
                if (findStart){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    static int[] linearSearch(int[] arr, int target){
        int[] ans = {-1, -1};
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] == target){
                ans[0] = i;
                break;
            }
        }
        for (int j = arr.length -1; j > 0; j--) {
            if (arr[j] == target){
                ans[1] = j;
                break;
            }
        }
        return ans;
    }
}
