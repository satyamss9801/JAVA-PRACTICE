import java.util.Scanner;

public class armstrong {

    static void arm(int n) {

        int x, z = 0;
        if (n < 1) {
            System.out.println("Invalid Number");
            return;
        }
        int y = n;
        while (n > 0) {
            x = n % 10;
            z = z + (x * x * x);
            n = n / 10;

        }
        if (z == y) {
            System.out.println("Number Is ArmStrong : " + y);
        } else {
            System.out.println("Not a ArmStrongNumber");
        }

    }

    public static int powero(int a, int b) {

        if (b == 0) {
            return 1;
        }
        System.out.println(a + " " + b);
        int i = a * powero(a, b - 1);
        System.out.println(i);
        return i;

    }

    public static void StrPowerSet(String s, int i, String cur) {
        if (i >= s.length()) {
            System.out.println(cur);
            return;
        }
        StrPowerSet(s, i + 1, cur + s.charAt(i));
        StrPowerSet(s, i + 1, cur);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int x = sc.nextInt();
        arm(x);

        sc.close();
    }

}
