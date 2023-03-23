import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //store roll no of 5 students
        int[] rno = new int[5];

        //store names of 5 students
//        String[] name = new String[5];
        //data of 5 students : {roll no, name, marks}

//        Student[] students = new Student[5];

//        Student kunal = new Student(12, "Kunal Khanan", 56.32f);
//        kunal.rno = 12;
//        kunal.name = "Kunal Kushwaha";
//        kunal.marks = 80.00f;

        Student kunal = new Student();
        kunal.greeting();
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        Student rahul = new Student();
        rahul.greeting();
        System.out.println(rahul.rno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);

    }
}

class Student{
    int rno;
    String name;
    float marks;

    // we need a way to add the values of the above properties object by object

    // we need one word to access every object
    Student () {  // Default Constructor
        this.rno = 12;
        this.name = "OG";
        this.marks = 23.32f;
    }

    void greeting() {
        System.out.println("Hello My name is " + this.name);
    }

    void changeName(String newName) {
        this.name = newName;
    }

    Student (int rno, String name, float marks) { // constructor
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }


}