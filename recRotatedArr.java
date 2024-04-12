import java.util.Scanner;

public class recRotatedArr {

    static int findKey(int arr[], int key, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == key) {
            return mid;
        }

        // Check if the left half is sorted
        if (arr[low] <= arr[mid]) {
            if (key >= arr[low] && key <= arr[mid]) {
                return findKey(arr, key, low, mid - 1);
            } else {
                return findKey(arr, key, mid + 1, high);
            }
        }

        // If the left half is not sorted, then the right half must be sorted
        if (key >= arr[mid] && key <= arr[high]) {
            return findKey(arr, key, mid + 1, high);
        } else {
            return findKey(arr, key, low, mid - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 60, 70, 80, 90, 10, 20, 30, 40, 50 };
        int key = 30;
        int index = findKey(arr, key, 0, arr.length - 1);
        if (index == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println(key + " found at index " + index);
        }
    }
}
