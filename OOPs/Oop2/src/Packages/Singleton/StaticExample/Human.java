package Packages.Singleton.StaticExample;

public class Human {
    String name;
    int age;
    float salary;
    boolean married;

    static long population;

    // this is a static variable, a static is something which
    // is not dependent upon object for example in this human class all the
    // properties like name, age, salary will depend or vary object to object
    // but for the whole human community the population will be same for all i.e 7 billion
    // so in representation of class in oop these properties are declared as static.
    // and they do not depend on object of the class.
    // since they do not depend on object of the class and this keyword represents
    // the current object in a class and helps us to access it
    // the static variable/methods/properties cannot be accessed by using
    // this keyword they will work but it is not recommended to use them for accessing any static instance
    // variable or methods or any thing having static keyword

    // they (static instance variables or methods or keywords)  are the properties of the whole class
    //ex. population for whole human class is 7 billion or
    // planets for whole human class in this world is 9 etc.
    // so they can be accessed using the class name in the constructor
    // and wherever required even for printing or accessing it.
    // className.StaticName ex. Human.population


    // since static variable are not dependent upon objects and this keyword or object.keyword is
    // not required to access them they can be accessed and called without even creation of object
    // that is we can print and access static variable without even creating an object of the class
    // because we know that they only depend on object and

    static void message() {
        System.out.println("Hello this is message");
    }
    public Human(String name, int age, float salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
//        Human.population = population;
        Human.population = 7000000;
    }
}
