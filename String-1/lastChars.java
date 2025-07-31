public class lastChars {
    public String lastChars(String a, String b) {
        char first = a.isEmpty() ? '@' : a.charAt(0);
        char last = b.isEmpty() ? '@' : b.charAt(b.length() - 1);
        return String.valueOf(first) + String.valueOf(last);
    }
}
