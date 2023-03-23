package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4.1, 4.3, 5.0);
        Box box2 = new Box(box);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);
//
//        System.out.println(box2.l + " " + box2.w + " " + box2.h);

//        BoxWeight box3 = new BoxWeight();
//        System.out.println(box3.h + " " + box3.weight);

//        BoxWeight box4 = new BoxWeight(1, 2, 3, 4);
//        System.out.println(box4.l + " " + box4.h + " " + box4.w + " " + box4.weight);


        // FUNNY THING
//        Box box5 = new BoxWeight(2, 3, 4, 5); // Here we have used the reference variable of Box
        // type but we have used object of BoxWeight type

//        System.out.println(box5.h); // We can access the parameters of Box type as it is the Reference Variable
//        System.out.println(box5.weight); // Here box5.weight will give error because in line 18 we have used
        // reference variable as Box type but we have used object as BoxWeight which will allow us to
        // access the parameters of Box type but not of BoxWeight.

        // Hence if we will do something which we have done in line no. 18 i.e Using different Reference variable
        // and with that different Object we can use the parameters of Reference variable class only


        // But we can have the reverse possible that is child reference variable and parent object also but there we can

//        BoxWeight box6 = new Box(1, 2, 3, 4);
        // this will give error because the parent class will have no idea what variables
        // are there in child class and we have initialized the constructor of parent class only.

//        BoxPrice box = new BoxPrice(5, 8, 200);




    }
}
