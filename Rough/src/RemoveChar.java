public class RemoveChar {
    public static void main(String[] args) {
        charRemover("", "aasdfas");
    }
    static void charRemover(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            charRemover(p, up.substring(1));
        }
        else {
            charRemover(p + ch, up.substring(1));
        }
    }
}
