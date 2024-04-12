import java.util.LinkedList;
import java.util.Scanner;

public class JosephusLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF PEOPLE");
        int n = sc.nextInt();
        System.out.println("Enter Elimination Interval");
        int k = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        // populate the linked list with people
        for (int i = 0; i <= n; i++) {
            list.add(i);
        }

        int index = 0;

        // repeat until only one person is left
        while (list.size() > 1) {
            System.out.println(index + "  " + list.size());
            index = (index + k - 1) % list.size();
            System.out.println("Index REmoved " + index);

            list.remove(index);
        }

        System.out.println("The last person standing is: " + list.get(0));
    }
}
