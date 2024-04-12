import java.util.Arrays;

public class compare {
    /* if null comes as element in it than the array contains null is smaller */

    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40 };
        int b[] = { 10, 20, 30, 50 };
        int res = Arrays.compare(a, b);

        if (res == 0) {
            System.out.println("BOTH ARE SAME");

        } else if (res > 0) {
            System.out.println("a is Greater");

        } else {
            System.out.println(" b is Greater");
        }

    }

}
