import java.util.Arrays;
// the time complexity of cyclic sort is O(n)
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 2};
        cycleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSorting(int[] arr){
       int i = 0;
       while (i < arr.length){
           int correct = arr[i] - 1; // the correct index will be value of elemnet - 1 , remember correct is not a value it is the index
           if (arr[i] != arr[correct]){// if the value at i != correct index swap
               swap(arr, i, correct);
           } else {
               i++;
           }
       }
    }
    static void swap(int[] arr,int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
