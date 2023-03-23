public class RangeXor {
    public static void main(String[] args) {
        System.out.println(zeroToAxor(5));
        System.out.println(xorFromAtoB(3, 9));
    }
    static int zeroToAxor(int a){
        if (a % 4 == 0){
            return a;
        }

        if (a % 4 == 1){
            return 1;
        }

        if (a % 4 == 2){
            return a + 1;
        }

//        if (a % 4 == 3)
            return 0;
    }
    static int xorFromAtoB(int a, int b){
        return zeroToAxor(b) ^ zeroToAxor(a - 1);
    }
}
