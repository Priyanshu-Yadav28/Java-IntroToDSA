package Generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
        private Object[] data;
        private int DEFAUlT_SIZE = 10;
        private int size = 0;
    CustomGenericArrayList() {
            this.data = new Object[DEFAUlT_SIZE];
        }

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

            CustomGenericArrayList<Integer> list3 = new CustomGenericArrayList<>();
//            list3.add(45);
//          list3.add("Prianshu"); // this would give error because we have provided type <Integer>
            for (int i = 0; i < 14; i++) {
                list3.add(2 * i);
            }
            System.out.println(list3);

   }
}
