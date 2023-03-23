package OOpPractiseTill3;

public class Students {
    int uid;
    String name;
    String section;
    float cgpa;
    char grade;
    static String branch = "CSE-AIML";

    Students (int uid, String name, String section, float cgpa, char grade) {
        this.uid = uid;
        this.name = name;
        this.section = section;
        this.cgpa = cgpa;
        this.grade = grade;
    }

    void display() {
        System.out.println(this.uid);
        System.out.println(this.name);
        System.out.println(this.section);
        System.out.println(this.cgpa);
        System.out.println(this.grade);
    }

}
