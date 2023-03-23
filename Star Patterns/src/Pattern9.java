public class Pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }
    static void pattern9(int n){
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < row; spaces++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < 2 * n - row - row - 1; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
