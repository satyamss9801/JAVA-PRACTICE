import java.util.Scanner;

public class EvenOdd {
    static void check(int num) {
        if ((num & 1) == 0) {
            System.out.println("Even Number Found : " + num);
        } else {
            System.out.println("Odd Number Found : " + num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        check(sc.nextInt());
    }

}
