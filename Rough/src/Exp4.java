public class Exp4 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(5);
        r1.setWidth(8);
        r1.setColor("red");

        Rectangle r2 = new Rectangle();
        r2.setLength(5);
        r2.setWidth(8);
        r2.setColor("red");

        System.out.println((r1.area() == r2.area() && r1.getColor() == r2.getColor()) ? "Matched" : "Not matched");

    }
}

class Rectangle {

    double length;

    double width;
    String color;
    double area;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    double area() {
        area = this.length * this.width;
        return area;
    }

}
