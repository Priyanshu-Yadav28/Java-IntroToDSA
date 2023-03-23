public class Main {
    public static void main(String[] args) {
        System.out.println("Hello This is Shapes !");
        Square s1 = new Square(10, 20, 30, 10);
        s1.setArea();
        System.out.println();

        Triangle t1 = new Triangle(1, 2, 4, 5);
        t1.area();
        System.out.println();

        Rectangle r1 = new Rectangle();
        r1.setArea();
    }
}