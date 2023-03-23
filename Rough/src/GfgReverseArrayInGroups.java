import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class GfgReverseArrayInGroups {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9};
        int k = 3;
        System.out.println(finding(arr, k));
    }
    static ArrayList<Integer> finding(int[] arr, int k){
        int start = 0;
        int end = k - 1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
