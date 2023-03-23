package Access;

public class ObjectDemo {
    int num;

    ObjectDemo(int num) {
        this.num = num;
    }
    // we will go in details of how to create n hashmap lecture
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
// these two we have done already
    @Override // string representation
    public String toString() {
        return super.toString();
    }

    @Override // comes when garbage collection hits.
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);
        System.out.println(obj.hashCode());
    }
}
