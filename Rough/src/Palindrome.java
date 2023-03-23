public class Palindrome {
    public static void main(String[] args) {
        boolean ans = isPalindrome(121);
        System.out.println(ans);
    }

    static boolean isPalindrome(int n) {
        if (reverse(n) == n) {
            return true;
        }
        else {
            return false;
        }
    }

    static int reverse(int n){
        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits);
    }
    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }
}
