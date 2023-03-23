public class RemoveChar {
    public static void main(String[] args) {
//        skip("", "baccadhah");
//        System.out.println(skip2("baccahdawahb"));
        System.out.println(skipAppNotApple("baccappleadb"));
    }
    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static String skip2(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if (ch == 'a') {
            return skip2(str.substring(1));
        } else {
            return ch + skip2(str.substring(1));
        }
    }
    static String skipAppNotApple(String s) {
        if (s.isEmpty()) {
            return "";
        }
        char ch = s.charAt(0);

        if (s.startsWith("app") && !s.startsWith("apple")) {
            return skipAppNotApple(s.substring(3));
        } else {
            return s.charAt(0) + skipAppNotApple(s.substring(1));
        }
    }
}
