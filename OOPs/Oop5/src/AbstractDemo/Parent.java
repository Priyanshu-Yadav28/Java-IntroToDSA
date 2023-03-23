package AbstractDemo;

public abstract class Parent {
    int age;

    Parent (int age) {
        this.age = age;
    }

    abstract void career();

    abstract void partner();

    static void hello() {
        System.out.println("Hey there !");
    }

    void normal() {
        System.out.println("This is a normal method");
    }
}
