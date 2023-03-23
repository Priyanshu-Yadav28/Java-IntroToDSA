import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
      int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target value: ");
        int target = in.nextInt();
        System.out.println(orderAgnosticBS(arr, target));
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc;
        isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return mid;
            }
            if (isAsc == true){
                System.out.println("Ascending");
                if (target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            else {
                System.out.println("Descending");
                if (target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
// Order agnostic binary search is used when we do not know
// weather the array is sorted in ascending order or descending order
// so first we check weather the array is sorted in ascending or in
// descending order and the apply binary search for them accordingly