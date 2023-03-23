public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(1));
    }
    static int fib(int n){
        if (n < 2){ // base condition
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
