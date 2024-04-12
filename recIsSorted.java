import java.util.Scanner;

public class recIsSorted {
    static boolean isSorted(int arr[], int idx) {
        if (idx >= arr.length)
            return true;
        if (arr[idx] < arr[idx - 1])
            return false;
        return isSorted(arr, idx + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int x = sc.nextInt();
        int arr[] = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.print("ENTER NUMBER : ");
            arr[i] = sc.nextInt();
        }
        if (isSorted(arr, 1) == true) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is Unsorted");
        }

    }

}
