import com.sun.security.jgss.GSSUtil;

public class Pattern {
    public static void main(String[] args) {
        starPattern2(4, 0);
    }
    static void starPattern2(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            starPattern2(row, col + 1);
            System.out.print("*");
        } else {
            starPattern2(row - 1, 0);
            System.out.println();
        }

    }

    static void starPattern(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("* ");
            starPattern(row, col + 1);
        } else {
            System.out.println();
            starPattern(row - 1, 0);
        }

    }
}
