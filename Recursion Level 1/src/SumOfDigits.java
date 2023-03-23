public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumDigit(1342));
    }
    static int sumDigit(int n){
        if (n == 0){
            return 0;
        }
        int lastDigit = n % 10;
        return lastDigit + sumDigit(n / 10);
    }

}
