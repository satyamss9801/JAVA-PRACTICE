import java.util.PriorityQueue;

/*TIME COMPLEXITY = O(n + (n-k)log n) */

import java.util.Scanner;

public class PrintLargestPq {

    static void printLarge(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);

        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);

        }
        for (int i = k; i < arr.length; i++) {
            if (pq.peek() < arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < k; i++) {
            System.out.print(pq.poll() + "  ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size Of Array");
        int x = sc.nextInt();
        int arr[] = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.println("Enter Values");
            arr[i] = sc.nextInt();

        }
        System.out.println("WHO  MANY MAXIMUM NUMBER YOU WANT TO PRINT ");
        int k = sc.nextInt();
        printLarge(arr, k);

    }
}
