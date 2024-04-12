import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class QueueRev {

    static void rev(Queue<Integer> q, int k) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        if (q.size() < k || k <= 0) {
            return;
        }

        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }

        while (stack.isEmpty() == false) {
            q.offer(stack.pop());

        }

        for (int i = 0; i < q.size() - k; i++) {
            q.offer(q.poll());
        }
        for (Integer x : q) {
            System.out.print(x + "  ");
        }

    }

    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Values in Queue");
            int x = sc.nextInt();
            q.add(x);
        }

        System.out.println("Enter Last index of Queue YOU Want to Reverse");
        int k = sc.nextInt();

        rev(q, k);

    }
}
