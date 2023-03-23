package OOpPractiseTill3;

public class Main {
    public static void main(String[] args) {
        Students st1 = new Students(6145, "Hariansh Singh", "AiML 5", 8.1f, 'A');
        Students st2 = new Students(6104, "Priyanshu Yadav", "AIML 12", 8.32f, 'A');
        Students st3 = new Students(6204, "Gaurang Adlakha", "AIML 6", 7.99f, 'B');
        Students st4 = new Students(6332, "Shreyas Paraj", "AIML", 8.01f, 'A');

        System.out.println();
        st1.display();
        System.out.println();
        st2.display();
        System.out.println();
        st3.display();
        System.out.println();
        st4.display();

    }
}
