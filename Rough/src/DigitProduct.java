public class DigitProduct {
    public static void main(String[] args) {
        int ans = productOfDigit(27);
        System.out.println(ans);
    }
    static int productOfDigit(int n) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * productOfDigit(n / 10);
    }
}
