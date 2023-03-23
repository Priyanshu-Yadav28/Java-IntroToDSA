public class PowerofTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));

    }
    static boolean isPowerOfTwo(int n){
//        int ans = n & (n - 1); // if n & n - 1 == 0 that means their is only one 1 present in the binary form
        // and we know that if there are more than one 1 in the binary form of a number
        // then the number is not a power of 2
//        if (ans == 0){
//            return true;
//        }
        if (n == 0){
            return false;
        }
        boolean ans = (n & (n - 1)) == 0;
        return ans;
//        return false;
    }
}
