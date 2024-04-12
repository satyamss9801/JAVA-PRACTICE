import java.util.Scanner;

public class nmmatrix {
    static int count(int n, int m) {
        if (n == 1 || m == 1)
            return 1;

        return count(n - 1, m) + count(n, m - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER DIMENTION OF N AND M ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Total Number of Ways : " + count(n, m));
    }
}