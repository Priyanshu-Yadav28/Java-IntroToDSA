public class NumberOfStepsToReduceToZeroLC1342 {
    public static void main(String[] args) {
        System.out.println(count(4));
    }

    static int count(int num) {

       return helper(num , 0);

    }

    static int helper(int num, int steps) {
        if (num == 0) {  // Base Condition.
            return steps;
        }

        if (num % 2 == 0) {
            return helper(num / 2, steps + 1);
        } else {
            return helper(num - 1, steps + 1);
        }
    }
}
