public class FirstUpperCase {
    public static void main(String[] args) {
        String str = "geesforeeks";
        upperCase(str);

    }
    static void upperCase(String up) {
        if (up.isEmpty()) {
            System.out.println("Null");
            return;
        }
        char ch = up.charAt(0);
        if (ch >= 65 && ch <= 91) {
            System.out.println(ch);
            return;
        }
        upperCase(up.substring(1));
    }
}
