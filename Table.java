import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");

        int y = sc.nextInt();
        if (y > 0 && y < 6) {
            for (int x = y; x <= (10 * y); x += y) {
                System.out.println(x);
            }
        } else {
            System.out.println("Invalid Table");
        }

    }

}
