package Generics.Comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
        // if diff == 0 both are equal
        // if diff < 0 : than o is bigger else o is smaller
    }

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }
}
