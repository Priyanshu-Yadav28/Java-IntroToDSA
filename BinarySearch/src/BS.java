import java.util.Scanner;

public class BS {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int[] arr2 = {90, 75, 18, 12, 6, 4, 3, 1};
//        int target = 14;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find its position in the array: ");
        int target = in.nextInt();
        System.out.println("Enter the second number for descending array:");
        int target2 = in.nextInt();
        System.out.println(binarySearch(arr, target));
        System.out.println(binarySearch2(arr2, target2));
    }
    static int binarySearch(int[]arr, int target){// for ascending order array
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int binarySearch2(int[]arr, int target){ // for descinding order array
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                start = mid + 1;
            }
            else if (target > arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
