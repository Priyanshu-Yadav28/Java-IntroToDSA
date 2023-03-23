package Generics;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private int DEFAUlT_SIZE = 10;
    private int size = 0;
     CustomArrayList() {
         this.data = new int[DEFAUlT_SIZE];
     }

     public void add(int num){
         if (isFull()){
             resize();
         }
         data[size++] = num;
     }

    private void resize() {
         int[] temp = new int[data.length * 2];
         // copy the current data in the new temp array.
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull(){
         return size == data.length;
     }
     private int size(){
         return size;
     }
    public int get(int index) {
        return data[index];
    }
    public int remove(){
         int removed = data[--size];
         return removed;
    }

    public void set(int index, int value){
         data[index] = value;
    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAUlT_SIZE=" + DEFAUlT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//
//        list.add(3);
//        list.add(5);
//        list.add(9);
//
//        System.out.println(list.size());
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        list.remove(0);
//        list.add(0, 12)
//        System.out.println(list.get(0));

        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(9);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list);

    }
}
