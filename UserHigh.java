import java.util.Scanner;

public class UserHigh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Number");
            int x = sc.nextInt();
            int y = x;

            if (x > y) {
                k = x;

            } else {
                k = y;

            }

        }
        System.out.println(k);
    }

}
