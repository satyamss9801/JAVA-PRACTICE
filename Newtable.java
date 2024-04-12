import java.util.Scanner;

public class Newtable {
    static void print(int n) {
        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < n + 1; j++) {
                int f = i * j;
                if (f < 10) {
                    System.out.print(" " + f + "  ");
                    continue;
                }
                System.out.print(f + "  ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ;
        System.out.println("Enter The Value Of Last table");
        int n = sc.nextInt();
        print(n);
    }

}
