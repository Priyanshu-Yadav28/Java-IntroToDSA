public class Seiveprime {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1]; // initially all the elements in the boolean
        // array will be false by default.
        seive(n, primes);
    }
    // false in the array means the numbers is prime.
    static void seive(int n, boolean[] prime){
        for (int i = 2; i * i <= n ; i++) { // make their multiples prime
            if (!prime[i]){ // prime[i] == false
                for (int j = i * 2; j <= n; j+= i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!prime[i]){// prime[i] == false
                System.out.print(i +" ");
            }
        }
    }
}
