import java.util.HashMap;
import java.util.Map;

public class HashMapDistintOne {
    static void countDistinct(int arr[], int k) {
        Map<Integer, Integer> Map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            Map.put(arr[i], Map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.print(Map.size() + " ");
        for (int i = k; i < arr.length; i++) {

            if (Map.get(arr[i - k]) == 1) {
                Map.remove(arr[i - k]);
            } else {
                Map.put(arr[i - k], Map.get(arr[i - k]) - 1);
            }
            Map.put(arr[i], Map.getOrDefault(arr[i], 0) + 1);
            System.out.print(Map.size() + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 44, 5, 15, 6, 4, 4, 6 };
        HashMapDistintOne.countDistinct(arr, 4);
    }

}
