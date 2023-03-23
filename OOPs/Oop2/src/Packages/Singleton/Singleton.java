package Packages.Singleton;

// when we need to create a class and we want that only one object of that class should
// exist and no other object can be created we use singleton class. A singleton class
// is a class which has one object.
// hence we need to stop anyone to call the constructor of this class because if constructor
// will be called then onl object will be created
// because an object is created with new keyword and constructor

public class Singleton {

    private Singleton () {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        // check weather instance is null or not if null create one else return
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }



}
