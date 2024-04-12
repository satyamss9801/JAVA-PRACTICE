import java.util.Scanner;

public class MaxVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER RANGE OR SIZE OR ARRAY");
        int x = sc.nextInt();
        int arr[] = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.print("Enter Value  : ");
            arr[i] = sc.nextInt();

        }
        int high = arr[0];

        for (int i = 1; i < x; i++) {
            if (arr[i] > high) {
                high = arr[i];
            }

        }
        System.out.println("MAX VALUE = " + high);
    }

}
