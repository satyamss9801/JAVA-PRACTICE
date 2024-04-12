import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union); // Output: [1, 2, 3, 4, 5, 6]

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection); // Output: [3, 4]

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference); // Output: [1, 2]
    }
}
