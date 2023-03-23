public class WealthOfPerson {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };
        System.out.println(maxWealth(arr));
    }
    static int maxWealth(int[][] arr) {
        int wealth = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > wealth) {
                wealth = sum;
            }
        }
        return wealth;
    }
}
