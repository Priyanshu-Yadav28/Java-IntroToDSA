import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 17, 19, 25, 30};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element :");
        int target = in.nextInt();
        System.out.println(search(arr, target));
    }
    // search in the array. return the index if item found
    // otherwise return -1 if item didnt found
    static int search(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
