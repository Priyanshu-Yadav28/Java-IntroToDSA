import java.util.Arrays;

public class LSin2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 4, 5},
                {1, 7, 8, 10},
                {9, 11, 32, 28, 25}
        };
        int target = 11;
        int[] ans = LSin2D(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] LSin2D(int[][] arr, int target){
        if (arr.length == 0){
            return new int[]{-1, -1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

}
