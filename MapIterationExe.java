import java.util.HashMap;
import java.util.Map;

public class MapIterationExe {
    public static int minOperations(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        int count = 0;

        for (int e : nums) {
            m.put(e, m.getOrDefault(e, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            int x = e.getValue();
            if (x == 1){
                return -1;
            }
            count += x/3 + (x%3 +1)/2;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {14, 12, 14, 14, 12, 14, 14, 12, 12, 12, 12, 14, 14, 12, 14, 14, 14, 12, 12};
        int result = minOperations(nums);

        System.out.println("Minimum number of operations: " + result);
    }
}
