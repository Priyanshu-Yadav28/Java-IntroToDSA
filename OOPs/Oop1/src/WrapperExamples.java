public class WrapperExamples {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        final int C = 199;// final keyword is used to make something unchangeable. If c is declared as
        // final it cannot be modified in the code further.
//        c = 111; // error
        final int INCREASE = 1222; // it is a convention that if a variable is declared as final
        // it should be in ALL CAPITAL. Also final variable have to be initialized and given value they
        // can be just declared and left that will give error(ONly for primitives). common sense


//        Integer a = new Integer(10);
        Integer num = 43; // Wrapper Class -> Using wrapper call we can create
        // primitives as an object.


    }
    static void swap(int a, int b) { // this wont swap because to swap reference is needed
        // and java only supports pass by value hence they will be swapped in the function
        // only and not in the memory location.
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A (String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizer Called Object is Destroyed");
    }
}
