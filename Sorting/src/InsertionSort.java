import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr =  {5, 3, 4, 1, 2};
        insertionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // here i < arr.length - 1 = i <= arr.length-2
            for (int j = i + 1; j >0; j--) {
                if (arr[j] < arr[j - 1]){
                    swap(arr, j, j- 1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int j , int last){ // last = j - 1 =  previous element than j
        int temp = arr[j];
        arr[j] = arr[last];
        arr[last] = temp;
    }
}
