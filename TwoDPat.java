
import java.util.Scanner;

public class TwoDPat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  THE NUMBER OF COLOUMN and Rows");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[][] arr = new int[x][y];

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                System.out.println("ENTER VALUE FOR ARRAY 1");
                arr[i][j] = sc.nextInt();

            }

        }

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                System.out.print(arr[i][j] + "  ");

            }
            System.out.println();

        }

        System.out.println("Find Negative Number");
        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {
                if (arr[i][j] < 0) {
                    System.out.print("INDEX IS :" + i + "Result is : " + arr[i][j] + "  ");
                }

            }
            System.out.println();

        }

    }
}
