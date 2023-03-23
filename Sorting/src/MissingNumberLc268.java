import java.util.Arrays;

public class MissingNumberLc268 {
    public static void main(String[] args) {
        int[] arr = {0, 4, 1, 2, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(missingElement(arr));
    }
    static int missingElement(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }
    static void sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int i , int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

}
