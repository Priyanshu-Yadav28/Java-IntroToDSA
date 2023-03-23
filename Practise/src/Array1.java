import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        create();
    }
    static void create() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element at position " + i);
            arr[i] = in.nextInt();
        }

        System.out.println("Output");
            for (int j = 0; j < size; j++) {
                System.out.println(arr[j]);
            }
        }
    }
