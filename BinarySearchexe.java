import java.util.Arrays;

public class BinarySearchexe implements Comparable<BinarySearchexe> {
    private String name;
    private int age;

    public BinarySearchexe(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(BinarySearchexe BinarySearchexe1) {
        return this.name.compareTo(BinarySearchexe1.name);
    }

     public static void main(String[] args) {
        BinarySearchexe[] people = { new BinarySearchexe("Alice", 25),
                new BinarySearchexe("Bob", 35),
                new BinarySearchexe("Charlie", 30),
                new BinarySearchexe("David", 40) };

        BinarySearchexe BinarySearchexe1 = new BinarySearchexe("Charlie", 30);
        int index = Arrays.binarySearch(people, BinarySearchexe1);

        if (index < 0) {
            System.out.println("BinarySearchexe not found");
        } else {
            System.out.println("BinarySearchexe found at index " + index);
        }
    }
}
