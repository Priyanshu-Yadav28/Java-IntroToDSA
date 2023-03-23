package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
//        int c = a / b;
////        System.out.println(c); // this will give error of exception
        // of Arithmetic Exception we can use exception
        // handling to deal with this type or errors

        try {
//            int c = a / b;
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("Normal Exception");
        }finally {
            System.out.println("No matter what happens this will always execute");
            // anything written under finally keywor will always execute wheather the
            // exception occurs or not
        }
    }
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }
}
