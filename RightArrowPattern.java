public class RightArrowPattern {
    public static void main(String[] args) {
        int size = 5; // You can adjust the size of the arrow as needed

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Single nested loop to print the arrow
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j <= size - i) {
                    System.out.print("  "); // Print spaces for the left side
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        // Print the arrowhead
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  "); // Print spaces for the right side
            }
            for (int j = i; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

