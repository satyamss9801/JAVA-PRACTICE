import java.util.Scanner;

public class recWaysToReach {
    static int jump(int n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;

        return jump(n - 1) + jump(n - 2) + jump(n - 3);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Stairs");
        int n = sc.nextInt();

        System.out.println(jump(n));
    }

}
