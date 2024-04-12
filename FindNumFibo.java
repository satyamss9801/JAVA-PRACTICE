import java.util.Scanner;

public class FindNumFibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's in the Fibonacci series: ");
        int num = scanner.nextInt();
        scanner.close();
        if (isInFibonacciSeries(num, 0, 1)) {
            System.out.println("\n"+num + " is in the Fibonacci series.");
        } else {
            System.out.println("\n"+ num + " is not in the Fibonacci series.");
        }
    }

    public static boolean isInFibonacciSeries(int num, int a, int b) {
        if (num == a || num == b) {
            return true;
        } 
        if (a + b > num) {
            return false;
        } else {
            System.out.print(a+b + "  ");
            return isInFibonacciSeries(num, b, a + b);
        }
    }
}
