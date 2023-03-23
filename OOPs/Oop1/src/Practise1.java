import java.util.Scanner;

public class Practise1 {
    public static void main(String[] args) {
        School stu1 = new School("Lalu", 6104, 8.34f, 'A');
        School stu2 = new School("Hariansh", 6145, 8.40f, 'A');
        School stu3 = new School("Pathak", 6262, 8.21f, 'A');
        School stu4 = new School("Tawde", 6223, 8.11f, 'A');
        School stu5 = new School("Leo Meo", 1762, 7.88f, 'A');

        System.out.println();
        stu1.printData();
        System.out.println();

        stu2.printData();
        System.out.println();

        stu3.printData();
        System.out.println();

        stu4.printData();
        System.out.println();

        stu5.printData();

    }
}
class School {
    String name;
    int rollno;
    float marks;
    char status;

    School (String name, int rollno, float marks, char status) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
        this.status = status;
    }

    void printData() {
        System.out.println("Student name is: " + this.name);
        System.out.println("Student roll no. is: " + this.rollno);
        System.out.println("Student status is: "+ this.status);
    }

}
