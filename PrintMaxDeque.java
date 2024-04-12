import java.util.ArrayDeque;
import java.util.Deque;

public class PrintMaxDeque {

    static void PrintMax(int arr[], int k) {

        Deque<Integer> dq = new ArrayDeque<Integer>();
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
                dq.addLast(i);

            }
        }

        for (int i = k; i < arr.length; i++) {
            System.out.println(arr[dq.peek()] + " ");
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
                dq.addLast(i);
            }
        }
        System.out.println(arr[dq.peek()]);
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 10, 20, 40, 30, 50, 40, 10 };
        PrintMax(arr, 3);
    }

}
