public class FindingIthBit {
    public static void main(String[] args) {
        System.out.println(ithBitFinding(10));
    }
    static int ithBitFinding(int n){
       return n &(1 << (n - 1));
    }
}
