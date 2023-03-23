package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(21);
        son.career();
        son.partner();
        son.normal();

        Daughter daughter = new Daughter(21);
        daughter.career();
        daughter.partner();

//        Parent mom = new Parent();  this is not allowed hence we cannot crate
//        an object of the Abstract Class.
//        we can also not crate abstract constructor.
//        we can also not create abstract static methods because static method
//        are not overridden and abstract means to override.
//        but we can create static methods as they are not dependent on objects.
        Parent.hello();
    }
}
