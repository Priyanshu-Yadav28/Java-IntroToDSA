import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
           int last = arr.length - i - 1;// this will always be decreasing
            // by 1 so that the loop do not runs for the swapped element which is already sorted
           int max = maxElement(arr, 0 , last);// this will find out the maximum
            // element in the array
          ; swap(arr, max, last); // and this function will send that max element to the last index of the
            // array at that time for which the length of the array is decided.
        }
    }
    static void swap(int[] arr, int max , int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
    static int maxElement(int[] arr, int start , int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
