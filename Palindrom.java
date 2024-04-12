import java.util.Scanner;

public class Palindrom {
    static void check(int num) {
        int r, sum = 0, temp;

        temp = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;

        }
        if (temp == sum) {
            System.out.println("Number is palindrom ");
        } else {
            System.out.println("Not a Palindrom Number");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER TO CHECK PALINDROM OR NOT");
        check(sc.nextInt());
    }

}
