import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FindingAllIndex {
    public static void main(String[] args) {
        int[] arr =  {2, 3, 5, 1, 9, 8, 8, 10};
        int target = 8;
        ArrayList<Integer> ans = findingAllIndex2(arr, target, 0, new ArrayList<>());
        System.out.println(ans);

    }
    static ArrayList<Integer> found = new ArrayList<>(); // method 1 using Arraylist from outside.
    static void findAllIndex(int[] arr, int target, int index) {

        if (index == arr.length){
            return;
        }

        if (arr[index] == target) {
            found.add(index);
        }

        findAllIndex(arr, target, index + 1);
    }
    // METHOD 2 : -------->  THIS IS THE BEST METHOD.

    static ArrayList<Integer> findingAllIndex2(int[] arr, int target, int index , ArrayList<Integer> ans){

        if (index == arr.length) {
            return ans;
        }

        if (arr[index] == target) {
            ans.add(index);
        }

        return findingAllIndex2(arr, target, index + 1, ans);
    }

    static ArrayList<Integer> findingAllIndex3(int[] arr, int target, int index) {
        // in this case new list will be created everytime the function runs so it is now that optimized .
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findingAllIndex3(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

}
