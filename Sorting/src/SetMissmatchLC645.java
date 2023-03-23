import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMissmatchLC645 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        int[] output = cycleSortandAns(arr);
        System.out.println(Arrays.toString(output));
    }
    static int[] cycleSortandAns(int[] nums){
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            int correct = nums[j] - 1;
            if (nums[j] != j + 1 ){
                return new int[] {nums[j], j+1};
            }
        }
        return new int[]{-1 , -1};
    }
    static void swap(int[] nums, int i , int correct){
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
