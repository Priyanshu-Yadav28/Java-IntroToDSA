public class Pattern12 {
    public static void main(String[] args) {
        pattern12(5);
    }
    static void pattern12(int n){
        for (int row = 0; row < 2 * n ; row++) {
            int spacesInRow = row > n ? 2 * n - row : row;
            for (int spaces = 0; spaces < spacesInRow; spaces++) {
                System.out.print(" ");
            }
            int colInRows = row > n ? row - n : n - row ;
            for (int col = 0; col < colInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
