import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Queue1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<Integer> ujjwal = new PriorityQueue<>(Comparator.reverseOrder());

        System.out.println("Enter value for queue");
        int i = 0;

        while (i < 5) {
            ujjwal.offer(sc.nextInt());
            i++;
        }

        System.out.println("sakshi's phone number is");

        // to retrive the maximum elemet

        System.out.println("max value of queue=" + ujjwal.peek());
        for (i = 0; i < 5; i++) {
            System.out.print(ujjwal.poll() + "  ");
        }
    }
}
