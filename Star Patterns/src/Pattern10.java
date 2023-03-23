public class Pattern10 {
    public static void main(String[] args) {
        pattern10(5);
    }
    static void pattern10(int n){
        for (int row = 0; row < n; row++) {

            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print(" ");
            }

            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
