public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch;
        }
        System.out.println(series);
        // since strings are immutable the performace of strings is very bad of complexity
        // O(N^2) because everytime the new value of i is added to ch the old value of ch
        // will remain in heap and no reference variable will be pointing to it
        // which will result in memory wastage and we cannot modify it because it is immutable
        // so it always creates a new object after adding something to the previous one
        // and this result in memory wastage so to resolve this there is a different datatype
        // which allows us to change or modify the previous value of string and helps us to
        // conserve memory that datatype is StringBuilder.

    }
}
