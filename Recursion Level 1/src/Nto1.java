import com.sun.security.jgss.GSSUtil;

public class Nto1 {
    public static void main(String[] args) {
        funBoth(5);
    }
    static void fun(int n) {
        if (n == 0){
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }
    static void fun2(int n) {
       if (n == 0) {
           return;
       }
        fun2(n - 1);
        System.out.println(n);
    }

    static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        funBoth(n - 1);
        System.out.print(n + " ");
    }

}
