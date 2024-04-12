import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER RANGE");
        int y = sc.nextInt();
        for (int i = 1; i <= y; i++) {
            System.out.println("CUBE OF " + i + "EQUAL TO " + (i * i * i));
        }
    }

}
