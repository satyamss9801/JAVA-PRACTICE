public class AssertExample {
    public static void main(String[] args) {
        int x = 10;

        // Using assert to check if x is greater than 0
        assert x > 0 : "x should be greater than 0";

        System.out.println("After the assert statement");
    }
}
