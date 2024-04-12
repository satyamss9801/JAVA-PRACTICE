import java.util.Scanner;

public class DivideSpecial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int x = 0, y = 0;

        if ((n & 1) == 0) {
            // If n is even
            x = n / 2;
            y = x;
            System.out.println(x + "  " + y);
        } else {
            // If n is odd
            x = n / 2;
            y = n / 2 + 1;

            System.out.println(x + "  " + y);
        }
    }
}
