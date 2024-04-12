import java.util.Scanner;

public class RotatedArr {
    static int findKey(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (key == arr[mid]) {
                return mid;
            }

            if (arr[low] <= arr[mid]) {

                if (key >= arr[low] && key < arr[mid]) {
                    high = mid - 1;

                } else {
                    low = mid + 1;

                }
            } else {
                if (key >= arr[mid] && key <= arr[high]) {
                    low = mid + 1;

                } else {
                    high = mid - 1;

                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 60, 70, 80, 90, 10, 20, 30, 40, 50 };
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALUE TO FIND INDEX");
        int x = sc.nextInt();
        int y = RotatedArr.findKey(arr, x);
        if (y == -1) {
            System.out.println("NUMBER NOT FOUND");
        } else {
            System.out.println(x + " Found At Index " + y);
        }
    }
}
