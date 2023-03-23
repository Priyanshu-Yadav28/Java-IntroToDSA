public class CountDigits { // we can count any digit but in this code we are
    // counting only zero.
    public static void main(String[] args) {
        System.out.println(count(102001));
    }
    static int count(int n) {
        return helper(n , 0);
    }

    static int helper(int n, int c) { // c == count.
        if (n == 0){
            return c;
        }
        int rem = n % 10;
        if (rem == 0){ // if we want to check other digits we can check rem == that digit.
            return helper(n / 10, c+ 1);
        }
        return helper(n / 10, c);
    }
}
