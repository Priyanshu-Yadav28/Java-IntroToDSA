package ExtendDemo2;

public interface A {
    // static interface method should always have body.
    // static methods are never inherited becasue if inheritance takes place then it
    // should be overriden and for that there must be object but static do not depends
    // uopon objects

    static void greeting() {
        System.out.println("Hey I am Static method");
    }
    void fun();
}
