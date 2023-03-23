import java.sql.SQLOutput;

interface animal {
     public void Leg();
}

class Dog implements animal {
   public void Leg() {
        System.out.println("Dog has four legs");
    }
}

class Duck implements animal {
   public void Leg() {
       System.out.println("Duck has two legs");
   }
}
public class Mst {
    public static void main(String[] args) {
     Duck d = new Duck();
     Dog b = new Dog();
     b.Leg();
     d.Leg();
    }
}
