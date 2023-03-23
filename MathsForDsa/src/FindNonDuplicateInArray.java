public class FindNonDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        System.out.println(nonDuplicate(arr));
    }
    static int nonDuplicate(int[] arr){ // optimized, time complexity
      int unique = 0;
      for (int n : arr){
           unique ^= n; // unique = unique ^ n;
      }
      return unique;
    }
}
