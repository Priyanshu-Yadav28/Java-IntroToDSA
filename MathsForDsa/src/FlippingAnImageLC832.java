import java.util.Arrays;

public class FlippingAnImageLC832 {
    public static void main(String[] args) {
        int[][] arr = {
                    {2, 3, 2, 5,},
                    {3, 1, 6, 9},
                    {9, 11, 32, 28}
        };
        flipImage(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void flipImage(int[][] image){
        for (int[] row : image){
            // reverse the array
//            int start = 0;
//            int end = row.length - 1;
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // swap the elements
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1];
                row[image[0].length - i - 1] = temp;
            }
        }
    }

}
