public class Array2Dprint {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 1},
                {7, 32, 21},
                {99, 100, 10}
        };
        display(arr);
    }
    static void display(int[][] arr) {
        for (int[] val : arr) {
            for (int row : val) {
                System.out.println(row);
            }
        }
    }

}
