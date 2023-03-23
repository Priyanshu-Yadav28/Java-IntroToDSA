public class CountPrimeLC204 {
    public static void main(String[] args) {
        System.out.println(countPrime(10));
    }
    static int countPrime(int n){
//        if (n < 2){
//            return 0;
//        }
        int count = 0;
        for (int i = 2; i < n ; i++) {
            if (isPrime(i)){
                count++;
            }
        }
        return count;
    }
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
