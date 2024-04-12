import java.util.Arrays;
import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER LAST NUMBER");
        int n = sc.nextInt();
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j <= n; j += i) {
                isPrime[j] = false;

            }
        }
        System.out.println("HERE IS SOME PRIME NUMBER");
        for (int b = 0; b < n; b++) {
            if ((isPrime[b]) == true) {
                System.out.println(b);
            }

        }

    }

}
