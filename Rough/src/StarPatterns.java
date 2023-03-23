import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of rows");
//        int n = in.nextInt();
        pattern(5);
    }
    static void pattern(int row) {
        helper(row, 0);
    }
    static void helper(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            System.out.print("* ");
            helper(row, col + 1);
        }
        else {
            System.out.println();
            helper(row - 1, 0);
        }
    }
}
