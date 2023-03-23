public class Gcd_Lcm {
    public static void main(String[] args) {
//        System.out.println(gcd(4, 18));
        System.out.println(lcm(2, 4));
    }

    static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a); //euclid's method or formula to find hcf
    }
}
