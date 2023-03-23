public class PascalTriangleSum {
    public static void main(String[] args) {
        System.out.println(method3(3));
    }
    static int pascalTriangleSumAtLine(int lineNo){ // Method 1 my logic
        if (lineNo == 1){
            return 2;
        }
        return 2 * pascalTriangleSumAtLine(lineNo - 1);
    }
    static int method2(int n){
        return (int)Math.pow(2, n);
    }
    static int method3(int n){
        return 1 << (n - 1);
    }
}
