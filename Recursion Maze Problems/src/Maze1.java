import java.util.ArrayList;

public class Maze1 {
    public static void main(String[] args) {
//        int ans = mazePathCount(3, 3);
//        System.out.println(ans);
        System.out.println(pathRetDiagonal("", 3, 3));
    }

    static int mazePathCount(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;    
        }
//        return mazePathCount(r - 1, c) + mazePathCount(r, c - 1);
        int left = mazePathCount(r - 1, c);
        int right = mazePathCount(r, c - 1);
        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + "D",r - 1, c);
        }
        if (c > 1) {
            path(p + 'R', r , c - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(pathRet(p + "D",r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRet(p + 'R', r , c - 1));
        }
        return list;
    }

    static int mazePathCountDiagonal(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
//        return mazePathCount(r - 1, c) + mazePathCount(r, c - 1);
        int left = mazePathCountDiagonal(r - 1, c);
        int right = mazePathCountDiagonal(r, c - 1);
        int digonal = mazePathCountDiagonal(r -1, c - 1);
        // because both rows and columns will be decreased by 1.
        return left + right + digonal;
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1) {
            list.addAll(pathRetDiagonal(p + 'D',r - 1, c - 1));
            // becaues when it will go diagonal both rows and columns will be decreased by 1.
        }

        if (r > 1) {
            list.addAll(pathRetDiagonal(p + 'V',r - 1, c));
        }

        if (c > 1) {
            list.addAll(pathRetDiagonal(p + 'H', r , c - 1));
        }

        return list;
    }
}
