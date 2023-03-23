import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1); // Integer will be converted to Integet that will call toString()
        // this is same as after a few steps: "a" + "1"
        System.out.println("Kunal" + new ArrayList<>());

    }
}
