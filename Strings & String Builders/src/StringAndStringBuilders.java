import java.sql.SQLOutput;

public class StringAndStringBuilders {
    public static void main(String[] args) {

        String name = "Priyanshu Yadav";
        System.out.println("The name is " + name);
//        Pool ---->
        /* 1) pool is a separate memory storage inside heap memory which stores objects of same value in strings so if
         2 or more objects will have same value then they will be stored in heap's pool .
         ex. String a = Kunal and String b = Kunal are two objects with same values so only one kunal will be created
         inside the heap and both a and b will point to it.
         2) if you want to check weather the object is pointed by two different reference variable
         use == method if it is true the reference variables are pointing the same object inside the pool. */

        String a = "Kunal";
        String b = "Kunal";
        System.out.println(a == b); // if a == b is true both a and b are pointing to
        // the same Kunal inside the pool and they are also equal that is all the characters in Kunal are same.


        // how to create same object with same value but different reference variables are pointing to them:
        // we can use new keyword to create different objects of same value
        // and these objects are created in heap. These objects will be outside the pool but in heap.
        String str1 = new String("Kunal");
        String str2 = new String("Kunal");
        System.out.println(str1);
        System.out.println(str2);
        // When you only need to check the values of the objects weather they are equal or not use
        // .equals method in string.
        System.out.println(str1.equals(str2)); // if this is false they str1 and str2 are not equal
        System.out.println(str1 == str2);
        // if we want to print any specific character of the string object we can use reference_variable.charAt(index)
        System.out.println("The Character at index 1 is "+ str1.charAt(1)); // this will print the char at index 1
    }
}
