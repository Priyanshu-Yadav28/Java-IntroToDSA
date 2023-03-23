package oop2;

public class StaticBlock {
    static int a = 4;
    static int b;

    static { // this only runs once, when the first object is created i.e. when the class is loaded
        // for the first time.
        System.out.println("We are in Static Block. And Static Block runs only once.");
        b = 5 * 4;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        // after adding 3 in b when we will print the value of b the static block will
        // not be called and the message in it we are in static block will not be printed
        // because static block runs only once when the static variable is declared.
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


    }
}
