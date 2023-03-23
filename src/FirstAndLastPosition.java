import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 5;
        int[] ans = ans(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] ans(int[] nums, int target){
        int[] ans = {-1 , -1};
        ans[0] = firstAndLast(nums, target, true);
        ans[1] = firstAndLast(nums, target,  false);
        return ans;
    }
    static int firstAndLast(int[] nums, int target, boolean findStartindex){
        int ans = -1;
        int start = 0;
        int end = 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < nums[mid]){
                end =  mid - 1;
            }
            else if (target > nums[mid]){
                start = mid + 1;

            } else {
               ans = mid;
               if (findStartindex){
                   end = mid - 1;
               } else {
                   start = mid + 1;
               }
            }
        }
        return ans;
    }


}
