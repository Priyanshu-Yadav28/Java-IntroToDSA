public class Concept {
    public static void main(String[] args) {
       fun(5);
    }
    static void fun(int n){ // infinite recursion the value of n will always be 5.
        if (n == 0) {
            return;
        }
        System.out.println(n);
//        fun(n--);
        fun(--n);
//        n-- vs --
        // n-- will first pass the value of n and after the function call it will
        // decrement the value so everytime the value of 5 is passed it is passed as 5 only
        // and no decrement is done .
//         where as --n will first decrement the value and then it use it
    }
}
