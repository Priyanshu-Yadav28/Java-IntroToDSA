public class WealthofPerson {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        System.out.println(sum(arr));

    }

    static int sum(int[][] arr){
        int max = 0;
        for (int person = 0; person < arr.length; person++) {
            int sum = 0; // ** important
            for (int account = 0; account < arr[person].length; account++) {
                sum = sum + arr[person][account];
            }
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }

}
