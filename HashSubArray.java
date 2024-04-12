import java.util.HashMap;

public class HashSubArray {
    static void subArray(int arr[], int sum) {
        int currsum = 0;
        int start = 0;
        int end = -1;

        HashMap<Integer, Integer> Map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            currsum = currsum + arr[i];

            if (currsum == sum) {
                start = 0;
                end = i;
                break;
            }

            if (Map.containsKey(currsum - sum)) {
                start = Map.get(currsum - sum) + 1;
                end = i;

            }

        }
        if (end == -1) {
            System.out.println("SubArray Not Found");
        } else {
            System.out.println(start + "  " + end);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 15, -20, 10, -15, 30, -5 };
        HashSubArray.subArray(arr, 5);
    }

}