public class BinarySearchSQRT {
    public static void main(String[] args) {
        int p = 3;
        int n = 40;
        System.out.printf("%.3f ",sqrt(p, n));
    }

    static double sqrt(int p, int n){
        int s = 0;
        int e = n;

        double root = 0.0;
        // this while loop will only return the ans when the number is perfect
        // square ex if the number is 36 6 * 6 == n will be true at some point
        // and if the number is not a perfect square ex. 40 this will return nothing
        // and the below for loop will return the ans.
        while (s <= e){
            int m = s + (e - s) / 2;
            if (m * m == n){
                return m;
            }
            if (m * m > n){
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        double incr = 0.1;
        // this for loop will run till root of n i.e 40 and it will find 6 and in order to give
        // the precise ans it will run for the following time
        for (int i = 0; i < p; i++) {
            while (root * root <= n){
                root = root + incr;
            }
            root = root - incr; // because the while loop got broken only because the value of root was more than 40 and
            // since everytime incr was added to it so that only will be subtracted once.
            incr = incr / 10; // and increment will be update to 0.01 , 0.02 and so on
            // depends on the precision.

        }
        return root;
    }
}
