import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Students hari = new Students(1, "Hariansh Singh", 55.13f);
        hari.greeting();
        hari.getData();

        System.out.println();

        Students copy = new Students(hari);
        copy.getData();
        copy.greeting();


    }
}

class Students {
    int rno;
    String name;
    float marks;

    Students () {
        this.rno = 13;
        this.name = "Priyanshu Yadav";
        this.marks = 99.32f;
    }

    Students (Students copy) {
        this.name = copy.name;
        this.rno = copy.rno;
        this.marks = copy.marks;
    }

    Students (int rno, String name, float marks) { // Parametrized Constructor
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    void getData() {
        System.out.println(this.name);
        System.out.println(this.rno);
        System.out.println(this.marks);
    }
    void greeting () {
        System.out.println("Good Morning " + this.name);
    }
}