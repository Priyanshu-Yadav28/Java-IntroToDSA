public class Pattern11 {
    public static void main(String[] args) {
        pattern11(5);
    }
    static void pattern11(int n){
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < row; spaces++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < n - row; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
