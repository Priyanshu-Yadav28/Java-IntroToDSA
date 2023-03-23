package Polymorphism;

public class Circle extends Shapes{
    @Override // annotation used to check overriding happening or not
    void area() { // This is method overriding
        // this function will run when the object of Circle is created
        // hence it is overriding the parent method
        // and if we do Shapes sh1 = new Circle();
        // even though we know that Shapes variables and methods will be called
        // but in this case Circle will be called because of this overriding.

        System.out.println("Area is Pi * r * r");
    }
}
