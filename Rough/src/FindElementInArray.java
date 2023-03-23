import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindElementInArray {
    public static void main(String[] args) {
        int[] arr = {2, 9, 6, 5, 7, 8, 9, 11, 10, 9, 22};
        ArrayList<Integer> allIndex = helper(arr, 9);
        System.out.println(allIndex);
    }
    static ArrayList<Integer> helper(int[] arr, int target) {
        return search(arr, 0, target, new ArrayList<>());
    }
    static ArrayList<Integer> search(int[] arr, int i, int target, ArrayList<Integer> ans) {
        if (i == arr.length) {
            return ans;
        }
        if (arr[i] == target) {
            ans.add(i);
        }
        return search(arr, i + 1, target, ans);
    }
}
