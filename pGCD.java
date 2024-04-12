import java.util.Scanner;

public class pGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First value : ");
        int a = sc.nextInt();
        System.out.print("Enter Second value : ");
        int b = sc.nextInt();
        System.out.println();
        System.out.print("GCD : " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
