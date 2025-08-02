public class old35 {
    public boolean old35(int n) {
        boolean multipleOf3 = n % 3 == 0;
        boolean multipleOf5 = n % 5 == 0;
        return (multipleOf3 || multipleOf5) && !(multipleOf3 && multipleOf5);
    }
}
