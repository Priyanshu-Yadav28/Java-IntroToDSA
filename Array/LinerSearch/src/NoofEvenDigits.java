public class NoofEvenDigits {
    public static void main(String[] args) {
        int[] arr = {11, 10, 12, 345, 2, 6, 7896};
        System.out.println(count(arr));
    }
    static int digitCount2(int n){
       return (int)(Math.log10(n) + 1);
    }


    static int count(int[] arr){
        int count = 0;
        for (int j : arr) {
            if (isEven(j)) {
                count++;
            }
        }
        return count;
    }
    static boolean isEven(int n){
        if (Digitcount(n) % 2 == 0){
            return true;
        }
        return false;
    }
    static int Digitcount(int n){
        if (n < 0){
            n = n * -1;
        }
        if (n == 0){
            return 1;
        }
        int count = 0;
        while(n > 0){
            count++;
            n = n / 10; // num /= 10;
        }
        return count;
    }
}
