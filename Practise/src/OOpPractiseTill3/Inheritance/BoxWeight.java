package OOpPractiseTill3.Inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight (BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }
    BoxWeight (double l, double w, double h, double weight) {
        super(l, w, h);

        this.weight = weight;
    }
}

