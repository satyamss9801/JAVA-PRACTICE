import java.util.Scanner;

public class recFibo {
    static int fibo(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibo(n - 1) + fibo(n - 2);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fibonacci Series Term 0 indexd : ");
        int x = sc.nextInt();
        System.out.println("Value : " + fibo(x));
    }

}
