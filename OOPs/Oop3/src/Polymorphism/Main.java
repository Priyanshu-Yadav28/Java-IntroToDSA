package Polymorphism;

public class Main {
    public static void main(String[] args) {
//        Shapes shape = new Shapes();
//        Circle circle = new Circle();
        Shapes square = new Circle(); // overriding
        // here we know that if we do Shapes square = new Circle();
        //by default Shapes properties, instance variables and methods
        // will be initialized but here opposite will happen and Circle
        // instance methods will be called due to overriding.

//        shape.area();
//        circle.area();
        square.area();
    }
}
