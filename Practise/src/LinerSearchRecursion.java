public class LinerSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 3, 10, 29, 122, 5, 7, 11};
        int target = 2;
        System.out.println(search(arr, target, 0));
    }

    static int search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }

        return search(arr, target, index + 1);
    }
}
