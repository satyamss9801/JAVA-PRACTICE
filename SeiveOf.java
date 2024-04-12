import java.util.*;

public class SeiveOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range to check odd or Even");
        int n = sc.nextInt();
        boolean isPrime[] = SeiveOfEratosthenes(n);
        for (int i = 0; i <= n; i++) {
            if (isPrime[i] == true)
                System.out.println(i + " : isPrime");
        }

    }

    static boolean[] SeiveOfEratosthenes(int n) {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j <= n; j += i) {
                isPrime[j] = false;

            }
        }
        return isPrime;

    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else {
            return gcd(b, a % b);
        }

    }
}