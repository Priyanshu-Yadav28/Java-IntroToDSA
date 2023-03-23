import java.util.Arrays;

public class BubbleSort { // Bubble sort is also known as syncing sort
    // and exchange sort
    // Time complexity =
    //                  1) Best Case = o(n),
    //                  2) Worst case = o(n^2)
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 2, 4, 6};
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSorting(int[] arr){
       boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }

    }
}
