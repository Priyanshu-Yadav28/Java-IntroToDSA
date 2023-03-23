public class NoOfbits {
    public static void main(String[] args) {
        System.out.println(noOfDigits(10));
    }
    static int noOfDigits(int n){
        int b = 2;       // base 2 for binary we can use 10 for decimal and 8 for octal it depends in which form we need the number of digits.
        int ans = (int)(Math.log(n) / Math.log(b)) + 1; // formula to count the no of digits in binary
        return ans;
    }



    static int bitCountOfaNumber(int n){ // function to count the number of digits
        // in binary of a number
        int count = 0;
        while (n > 0){
            n = n >> 1;
            count++ ;
        }
        return count;
    }
}
