public class Triangle extends Shapes{
    float side;

    Triangle () {
        this.side = 10;

    }
    Triangle (float l, float b, float h, float side) {
        super(l, b, h);
        this.side = side;
    }

    void area() {
        System.out.println("The area of Triangle is " + (0.5 * b * h));
    }
}
