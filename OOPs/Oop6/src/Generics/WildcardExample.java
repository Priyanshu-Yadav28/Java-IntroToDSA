package Generics;

import java.util.Arrays;

// wildcard is the method
// by which we can restrict the Generics to a certain
//   type only for example if we set the generics to Integer
//    it will only accept the Integer value in the arraylist
public class WildcardExample<T extends Number> {
    private Object[] data;
    private int DEFAUlT_SIZE = 10;
    private int size = 0;
    WildcardExample() {
        this.data = new Object[DEFAUlT_SIZE];
    }

//    public void getList(List<? extends Number>){
//        //do something
//    } w

    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
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
    public T get(int index) {
        return (T)(data[index]);
    }
    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public void set(int index, T value){
        data[index] = value;
    }


    @Override
    public String toString() {
        return "CustomGenericArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAUlT_SIZE=" + DEFAUlT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

    }
}
