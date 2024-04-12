
import java.util.Scanner;

public class Natural {

    static void whilel(int x) {
        int y = 1;
        int z = 0;
        if (x > 0 && x < 50) {
            while (y < x) {
                z = z + y;
                y++;
            }

        } else {
            System.out.println("OUT OF RANGE");
        }
        System.out.println("Total Number = " + z);
        System.out.println(" While Executed");
    }

    static void forl(int x) {
        int z = 0;
        if (x > 0 && x < 50) {
            for (int y = 1; y < x; y++) {
                z = z + y;
                y++;
            }

        } else {
            System.out.println("OUT OF RANGE");
        }
        System.out.println("Total Number = " + z);
        System.out.println("FOR Loop Executed");
    }

    static void dowhile(int x) {
        int z = 0;
        int y = 1;
        if (x > 0 && x < 50) {
            do {
                z = z + y;
                y++;
            } while (y < x);

        } else {
            System.out.println("OUT OF RANGE");
        }
        System.out.println("Total Number = " + z);
        System.out.println("DO While Executed");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Last Digit ");
        int x = sc.nextInt();
        forl(x);
        whilel(x);
        dowhile(x);

    }

}
