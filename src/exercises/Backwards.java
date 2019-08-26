package exercises;

public class Backwards {

    public static void main(String[] args) {
        String test = "Hi! My name is Todd.";
        System.out.println(reverse(test));
    }

    private static String reverse(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }

}
