import java.util.ArrayList;
import java.util.Arrays;

public class SumOfArrayLC1480 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(nums));
    }
    static int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    } // Time Complexity = o(n)
    // Space Complexity = O(1)
}
