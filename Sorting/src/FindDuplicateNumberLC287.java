import java.util.Arrays;

public class FindDuplicateNumberLC287 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2};
        System.out.println(sortingAndFindDuplicate(arr));
        System.out.println(Arrays.toString(arr));
    }
    static int ans2(int[] arr){ // Kunal's approach
        int i = 0;
        while (i < arr.length){
            if (arr[i] != i + 1){
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]){
                    swap(arr, i , correct);
                }
                else {
                    return arr[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;
    }
    static int sortingAndFindDuplicate(int[] arr){ // my approach but this is only applicable when there
        // is only one element which is repeated
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
        return arr[arr.length - 1];
    }
    static void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
