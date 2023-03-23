public class Maze {
    public static void main(String[] args) {
        int n = 3;
        int[][] arr = new int[n][n];
        System.out.println(mazePath(arr, 0 ,0));

//        mazePathPrint( "", 0, 0);
    }
    static int mazePath(int[][]arr, int row, int col) { // when array start from 0.
        if (row == arr.length - 1 || col == arr.length - 1) {
            return 1;
        }

        int left = mazePath(arr, row + 1, col);
        int right = mazePath(arr, row , col + 1);
        return left + right;
    }

    static void mazePathPrint(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }

        if (row > 1) {
            mazePathPrint( p + "D", row - 1, col);
        }
        if (col > 1) {
            mazePathPrint( p + "R", row , col - 1);

        }

    }
}
