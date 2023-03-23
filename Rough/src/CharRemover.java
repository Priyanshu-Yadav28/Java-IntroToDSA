public class CharRemover {
    public static void main(String[] args) {
        String s = "baccad";
    }
    static String remover(String s) {
        if (s.isEmpty()) {
            return " ";
        }
        char ch = s.charAt(0);

        if (ch == 'a') {
            return remover(s.substring(1));
        } else {
            return ch + remover(s.substring(1));
        }


    }
}
