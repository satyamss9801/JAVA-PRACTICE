import java.io.CharConversionException;
import java.util.Scanner;

public class fastPower {
    static int fast(int a, int b, int res) {

        if (b == 0) {

            return 1;
        }
        res = fast(a, b - 1, res) * a;

        return res;
    }

    public static void main(String[] args) throws CharConversionException {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value Of Number And value of Power On it");

            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 || b == 0)
                System.out.println("Sorry , Exception Found");
            else
                System.out.println("VALUE = " + fast(a, b, 1));
        } catch (Exception e) {
            e.getStackTrace();
        }

    }

}
