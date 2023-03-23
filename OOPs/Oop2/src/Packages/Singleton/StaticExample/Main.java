package Packages.Singleton.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Priyanshu", 20, 150000, false);
        System.out.println(h1.name);
        System.out.println(h1.age);
        System.out.println(h1.salary);
        System.out.println(h1.married);

        System.out.println(Human.population);
        Human.message();

        // here we will use Human(class Name).the static keyword
        // even if we do not create the object h1 or kunal we can access the static variable population
        // because we know that static variable do not depend upon object so they can also be accessed
        // and manipulated by without creating an object just the class should be there.
        //ex is

//        greeting(); // error because greeting is non static and main is static
        // we cannot use non static methods from static methods. because something which will
        // not be static belongs to an object.
    }
    // We know that something which is not static, belongs to an object

    static void fun() {
//        greeting(); you cannot use this because it is non static so it requires and instance.
        // but the function which we are using is static and does not depend on instance


        // you cannot access non static stuff without referencing their instances in
        // a static context.

        // hence here we are referencing it
        Main obj = new Main();
        obj.greeting();
    }
    void greeting() {
        System.out.println("Hello World");
    }
}


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
