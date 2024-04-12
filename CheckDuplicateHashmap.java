import java.util.*;

import java.util.HashMap;

public class CheckDuplicateHashmap {
    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 65, 45, 5, 96, 69, 36, 96 };
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (h.containsKey(arr[i])) {
                h.put(arr[i], h.get(arr[i]) + 1);
            } else {
                h.put(arr[i], 0);
            }
        }
        h.forEach((x, y) -> System.out.println(x + "  " + y));

    }
}
