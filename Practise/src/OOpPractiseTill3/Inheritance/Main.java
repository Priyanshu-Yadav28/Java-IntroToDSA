package OOpPractiseTill3.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//        Box box1 = new Box(2);
//        Box box2 = new Box(2, 5, 4);
//        System.out.println(box2.l + " " +  box2.w + " " +  box2.h);


//        BoxWeight box3 = new BoxWeight();
//        System.out.println(box3.w);

        BoxWeight box4 = new BoxWeight(2, 4, 6, 8);
        System.out.println(box4.l + " " + box4.w + " " + box4.h + " " + box4.weight);


        //funny thing
//        Box b5 = new BoxWeight(1, 3, 5, 7);
//        System.out.println(b5.l + " " + b5.w + " " + b5.h);

        BoxWeight b6 = new BoxWeight(box4);
        System.out.println(b6.l + " " + b6.w + " " + b6.h + " " + b6.weight);



    }
}
