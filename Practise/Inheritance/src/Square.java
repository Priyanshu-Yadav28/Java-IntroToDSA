public class Square extends Shapes{
    float side;

    Square () {
        this.side = 10;
    }
    Square (float l, float b, float h, float side) {
        super(l, b, h);
        this.side = side;
    }

    void setArea() {
        System.out.println("The area of Square is " + (side * side));
    }
}
