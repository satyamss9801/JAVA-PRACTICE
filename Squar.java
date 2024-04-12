import java.util.Scanner;

public class Squar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 0;

        while (y <= 0) {
            System.out.println(x * x);
            System.out.println("DO you WANT to find More if yes tap 0 else type any number ");
            y = y + sc.nextInt();
            if (y == 0) {
                x = 0;
                x = sc.nextInt();

                System.out.println(x * x);
            } else {
                y++;
            }

        }
    }

}
