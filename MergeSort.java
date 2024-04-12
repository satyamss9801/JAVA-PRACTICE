public class MergeSort {
    static void sort(int arr[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            sort(arr, l, mid);
            sort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }

    }

    static void merge(int arr[], int l, int mid, int r) {
        int n = (r - l) + 1;//new copy array size
        int arr1[] = new int[n];

        int i = l;//Existing array initial index
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                arr1[k] = arr[i];
                i++;
            } else {
                arr1[k] = arr[j];
                j++;
            }

            k++;
        }

        while (i <= mid) {
            arr1[k] = arr[i];
            i++;
            k++;
        }

        while (j <= r) {
            arr1[k] = arr[j];
            j++;
            k++;
        }
        
        i = l;
        k = 0;

        while (i <= r) {
            arr[i] = arr1[k];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 54, 12, 45, 66, 85, 12, 3 };
        sort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.err.print(i+" ");
        }

    }
}
