package pl.kowalczyk.codility;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(getReverseString1("abcd"));
    }


    private static String getReverseString1(String string) {
        StringBuilder builder = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--) {
            builder.append(string.charAt(i));

        }
        return builder.toString();
    }
}
