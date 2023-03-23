package Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human kunal = new Human(34, "Kunal Kushwaha");
//        Human twin = new Human(kunal); // this is basically
        // making a copy of kunal and it takes more time because
        // it is using new. So in order to clone an Object
        // there is a way of object cloning with clone method
        // in java which can be used to make this copies
        // and it will take less time to use it there
        // is an interface cloneable

        Human twin = (Human) kunal.clone();
        System.out.println(twin.age + " " + twin.name);

    }
}
