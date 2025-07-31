public class extraFront {
    public String extraFront(String str) {
        String firstTwo = str.length() >= 2 ? str.substring(0, 2) : str;
        return firstTwo + firstTwo + firstTwo;
    }
}
