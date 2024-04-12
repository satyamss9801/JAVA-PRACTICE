import java.util.*;

public class sorting {

    static void bubblesort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static void insertionsort(int arr[]) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > arr[i]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }

    static void selectionsort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minidx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minidx]) {
                    minidx = j;
                }
                int temp = arr[minidx];
                arr[minidx] = arr[i];
                arr[i] = temp;

            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static int partition(int arr[], int l, int h) {
        int pivot = arr[l];
        int i = l;
        int j = h;

        while (i < j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[j];
        arr[j] = arr[l];
        arr[l] = temp;

        return j;
    }

    static void quicksort(int arr[], int s, int e) {
        if (s < e) {
            int p = partition(arr, s, e);
            quicksort(arr, s, p - 1);
            quicksort(arr, p + 1, e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("ENTER 6 VALUES");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        quicksort(arr, 0, 5);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
