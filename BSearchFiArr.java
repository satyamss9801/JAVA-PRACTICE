import java.util.*;
import java.util.Arrays;

public class BSearchFiArr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER LENGTH OF ARRAY");
        int x = sc.nextInt();
        int arr[] = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Enter value : ");
            arr[i] = sc.nextInt();

        }
        System.out.print("Enetr the Number you want to find : ");
        x = sc.nextInt();
        Arrays.sort(arr);
        int y = Arrays.binarySearch(arr, x);
        if (y < 0)
            System.out.println("VALUE NOT FOUND ");
        else
            System.out.println("VALUE " + arr[y] + " Present At index " + y);
        System.out.println();
    }

}
