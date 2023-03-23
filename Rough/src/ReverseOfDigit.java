public class ReverseOfDigit {
    public static void main(String[] args) {
        int ans = reverse2(465);
        System.out.println(ans);
    }
    // brute force method
    static int reverse(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n / 10;
        }
        return ans;
    }
    // Solving with Recursion.
    static int reverse2(int n) {

        int digit = (int) (Math.log10(n)) + 1;
        return helper(n, digit);
    }
    static int helper(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10, digit - 1) + helper(n / 10, digit -1);
    }

}
