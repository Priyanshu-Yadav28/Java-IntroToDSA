package oop2.Singleton;

import java.util.Enumeration;

public class Singleton {
    private int num = 0;
    private Singleton () {

    }
    private static Singleton instance;

    public static Singleton getInstance() {
        // check wheather only 1 obj is only created or not
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

