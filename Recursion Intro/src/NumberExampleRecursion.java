public class NumberExampleRecursion {
    public static void main(String[] args) {
        // Write a function that takes in a number and prints it.
        // Print first 5 numbers: 1 2 3 4 5
        print(1);
    }
    static void print(int n){
        // base condition - condition where out recursive function stops making new calls
        if (n == 5){ // if base condition will not be here this print function
            // will go printing numbers from 1 to indefinite
            System.out.println(n);
            return;
        }
        System.out.println(n);

        //Recursive call
        // if you are calling a function again and again you can treat it as recursive call.
        print(n + 1);
    }
}
