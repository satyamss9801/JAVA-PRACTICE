import java.util.*;

public class StreamMax {
    public static void main(String[] args) {
        /* USE BOTH FOR MIN AND MAX VALUES */
        List<Integer> al = Arrays.asList(54, 54, 56, 5, 25, 78, 45, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> maxElement = al.stream().max(Integer::compare);
        maxElement.ifPresent(max -> System.out.println("Maximum element in the stream is " + max));

        al.stream()
                .skip(3)
                .forEach(System.out::println);

        System.out.println("Count Called = " + al.stream().count());

        System.out.println("Distinct called =" + al.stream().distinct());

        int sum = al.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum of elements in the stream: " + sum);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        if (max.isPresent()) {
            System.out.println("Maximum element in the stream: " + max.get());
        } else {
            System.out.println("Stream is empty!");
        }

    }

}
