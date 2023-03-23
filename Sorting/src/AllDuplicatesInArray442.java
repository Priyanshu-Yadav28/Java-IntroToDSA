import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDuplicatesInArray442 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        cycleSort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(cycleSort(nums));
    }

//    static List<Integer> duplicate(int[] nums){
//        ArrayList<Integer> ans = new ArrayList<Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != i + 1){
//                int correct = nums[i] - 1;
//                if (nums[i] == nums[correct]){
//                    ans.add(nums[i]);
//                }
//            }
//        }
//        return ans;
//    }
    static List<Integer> cycleSort(int[] nums){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i =  0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]){
                swap(nums, i , correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1){
                int correct = nums[j] - 1;
                ans.add(nums[j]);
//                if (nums[j] == nums[correct]){
//                    ans.add(nums[j]);
//                }
            }
        }
        return ans;
    }
    static void swap(int[] nums, int i, int correct){
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
