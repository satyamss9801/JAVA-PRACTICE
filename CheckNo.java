import java.util.Scanner;

public class CheckNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers");
        int x = sc.nextInt();

        if (x == 0) {
            System.out.println("Number is 0 ");
        } else {
            if (x > 0) {
                System.out.println("Positive number found " + x);
            } else {
                System.out.println("Negative number found" + x);
            }
        }

    }

}
