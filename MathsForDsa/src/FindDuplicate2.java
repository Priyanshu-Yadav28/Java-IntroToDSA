public class FindDuplicate2 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2};
        System.out.println(findUnique(arr));
    }
    static int findUnique(int[] nums){
        int unique = 0;
        for (int i = 0; i < nums.length; i++) {
            int tempunique = 0;
            tempunique = tempunique ^ nums[i];
        }
        return unique;
    }
}
