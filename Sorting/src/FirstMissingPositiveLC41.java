public class FirstMissingPositiveLC41 {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1}; // -1, 1, 3, 4
        System.out.println(firstPositiveMissing(arr));
    }
    static int firstPositiveMissing(int[] nums){
        // first of all we will sort the array.
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
             // we are ingoring negatives and zero because in
                // the question it is asked to return
                // the SMALLEST POSITIVE number.

            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        // after sorting we will apply the algorithm to return smallest missing
        // positive integer in the array
        for (int j = 0; j < nums.length; j++) {
             // if the element is less than 0 and greater than the
                // size of the array we are skipping them because in the question we are asked to return
                // the smallest positive number and if the number is negative i.e less than 0 and
                // greater than the size of the array we will skip it.
            if (nums[j] != j + 1){
                return j + 1 ;
            }
        }
        return nums.length + 1;
    }


    static void swap(int[] nums, int i, int correctIndex){
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}
