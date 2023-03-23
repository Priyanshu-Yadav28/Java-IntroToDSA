package Inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight () {
        this.weight = -1;
    }

    BoxWeight (double l, double h, double w, double weight) {
        super(l, h, w); // What is this ? This is super keyword and it is used to call
        // the parent class constructor.
        // used to initialize values present in parent class
        // we can also access the parameters of the parent class using super keyword
        System.out.println(super.h);
        System.out.println(this.h); // both are same thing just the super will call
        // directly and this will first check in child class and if there no h will exist
        // then it will check in parent class.
        // if there are two variables with same name in both super and sub class i.e parent
        // and child class and if there we will use this keyword that will only give us the
        // child class variable access but when we need to access the same named variable of
        // parent class we can use super.var_name to call that variable from parent class directly

        System.out.println(this.weight);
//        System.out.println(super.weight); // this will call the weight of parent class


        this.weight = weight;
    }


    BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight (double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
