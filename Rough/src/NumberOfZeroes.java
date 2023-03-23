public class NumberOfZeroes {
    public static void main(String[] args) {
        System.out.println(count(10201, 0));
    }
    static int count(int n, int ct) {
        if (n == 0) {
            return ct;
        }
        int rem = n % 10;
        if (rem == 0) {
            return count(n / 10, ct + 1);
        }
        return count(n / 10, ct);
    }
}
