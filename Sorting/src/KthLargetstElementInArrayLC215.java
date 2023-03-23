import java.util.Arrays;

public class KthLargetstElementInArrayLC215 {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(cyclicSort(arr, k));
        System.out.println(Arrays.toString(arr));
    }
    static int cyclicSort(int[] nums, int k){
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                swap(nums, i , correctIndex);
            } else {
                i++;
            }
        }
        return nums[k - 1];
    }
    static void swap(int[] nums, int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
