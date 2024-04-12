import java.util.*;

public class SortByTreeSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("ENTER VALUE : ");
            arr[i] = sc.nextInt();
        }

        sc.close();
        TreeSet<Integer> uniqueElements = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            uniqueElements.add(arr[i]);
        }
        for (int element : uniqueElements) {
            System.out.print(element + " ");
        }
    }
}
