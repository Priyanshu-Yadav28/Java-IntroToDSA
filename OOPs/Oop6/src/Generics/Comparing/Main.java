package Generics.Comparing;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(12, 87.55f);
        Student rahul = new Student(25, 97.15f);

//        if (kunal < rahul) {// here this will give error because there are two instance
//            // variables passed and java will get confused among which of the
//            // two it should compare based on rollno or based on marks.
//            System.out.println("Rahul has more marks");
//        } // to solve this problem there is an interface in java which is Comparable


//        so now the correct way to compare the two objects is

        if (kunal.compareTo(rahul) < 0) {
            System.out.println("Rahul has more marks ");
        }
    }
}
