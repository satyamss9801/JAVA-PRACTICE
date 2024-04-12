import java.util.*;

public class Skip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range");
        int x = sc.nextInt();
        int y = x;

        for (int i = 1; i <= x; i++) {
            if ((i & 1) == 0) {
                System.out.println(i - 1);
            } else {
                System.out.println(y);
                y--;
            }

        }
    }

}
