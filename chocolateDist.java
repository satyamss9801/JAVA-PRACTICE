import java.util.Arrays;
import java.util.Scanner;

public class chocolateDist {

    static int mindef(int arr[], int m) {
        if (m > arr.length) {
            return Integer.MAX_VALUE;
        }

        Arrays.sort(arr);
        int res = arr[m - 1] - arr[0];
        for (int i = 1; (i + m - 1) < arr.length; i++)
            res = Math.min(res, (arr[i + m - 1] - arr[i]));

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 20, 5, 6, 2, 4, 8, 12, 65 };
        System.out.println("ENTER NUMBER OF BOXES");
        int m = sc.nextInt();
        System.out.println(mindef(arr, m));
    }

}
