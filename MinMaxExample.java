import java.util.*;

public class MinMaxExample {
    public static void main(String[] args) {
        // Create a list of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(30);
        numbers.add(15);

        // Find the minimum and maximum values in the list
        int minValue = Collections.min(numbers);
        int maxValue = Collections.max(numbers);

        // Print the results
        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
    }
}
