public class IsEven {
        public static void main(String[] args) {
            // if the number will be even the function will return true.
            // if the number will be odd the finction will return false.
            System.out.println(isEven(45));
        }
        static boolean isEven(int n){
            if ((n & 1) == 0){
                return true;
            }
            return false;
        }
    }

