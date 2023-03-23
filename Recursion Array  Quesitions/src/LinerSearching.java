import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class LinerSearching {
    public static void main(String[] args) { // linear search with recursion.
        int[] arr = {2, 4, 3, 1, 7, 8, 9, 6, 8, 10};
        int target = 8;

    }

    static int searching(int[] arr, int target, int index) {

        if (index == arr.length){
            return -1;
        }

        if (target == arr[index]) {
            return index;
        }

        return searching(arr, target, index + 1);

    }


}
