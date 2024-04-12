import java.util.Scanner;

public class AddArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  THE NUMBER OF COLOUMN");
        int x = sc.nextInt();
        System.out.println("ENTER THE NUMBER OF ROWS IN ARRAYS");
        int y = sc.nextInt();

        int[][] arr = new int[x][y];
        int[][] arr1 = new int[x][y];
        int[][] arr2 = new int[x][y];

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                System.out.println("ENTER VALUE FOR ARRAY 1");
                arr[i][j] = sc.nextInt();
                System.out.println("ENTER VALUE IN 2nd Array");
                arr1[i][j] = sc.nextInt();
                arr2[i][j] = arr[i][j] + arr1[i][j];

            }

        }

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {
                if (i == j) {
                    System.out.print("INDEX IS :" + i + "Result is : " + arr2[i][j] + "  ");
                }

            }
            System.out.println();

        }

    }
}
