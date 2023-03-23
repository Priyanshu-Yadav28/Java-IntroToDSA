package Access;

public class Subclass extends A{
    public Subclass (int num, String name) {
        super(num, name);
    }

    class SubSubclass extends Subclass {
        public SubSubclass(int num, String name) {
            super(num, name);
        }
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(45, "Kunal Kushwaha");
//        int n = obj.num;
        System.out.println(obj instanceof A);
        System.out.println(obj instanceof Subclass);
        System.out.println(obj instanceof Object); // all objects are instance of Object class.

        System.out.println(obj.getClass().getName()); // stored in heap

    }

}
