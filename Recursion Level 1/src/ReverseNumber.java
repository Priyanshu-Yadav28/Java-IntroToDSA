import com.sun.security.jgss.GSSUtil;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }
    static int sum = 0; // method 1 from line 7 - 14.
    static void rev1(int n) { // we are doing kind of cheating as we are using sum from outside.
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n / 10);
    }
    static boolean isPalindrome(int n){
        return n == rev2(n);
//        if (n == rev2(n)){
//            return true;
//        }
//        return false;
    }

    static int rev2(int n) {
        // sometime you might need some additional variables in the argument
        // in that case, make another function as helper function.
        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits);
    }
    static int helper(int n, int digits){
        if (n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10, digits -1) + helper(n / 10, digits - 1);
    }



}
