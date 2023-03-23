public class DigitProduct {
    public static void main(String[] args) {
        int ans = digitProduct(55);
        System.out.println(ans);
    }
    static int digitProduct(int n) {
        if (n % 10 == n) {
            return n;
        }
        int last = n % 10;
        return last * digitProduct(n / 10);
    }
}
