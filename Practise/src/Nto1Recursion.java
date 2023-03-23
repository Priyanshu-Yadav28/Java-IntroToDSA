public class Nto1Recursion {
    public static void main(String[] args) {
//        nToOne(5);
//        method2(5);
//        funRev(5);
//        System.out.println(factorial(6));
        System.out.println(sumDigit(7905));
    }
    static void nToOne(int n) {
        if (n <= 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        nToOne(n - 1);
    }
    static void method2(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        method2(n - 1);
    }
    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funRev(n - 1);
        System.out.println(n);
    }
    static int factorial(int n) {
        if (n < 2) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int sumDigit(int n) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem + sumDigit(n / 10);
    }
}
