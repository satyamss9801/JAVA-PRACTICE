import java.util.Collections;
import java.util.PriorityQueue;

public class Priorityq {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder(null));
    pq.add(10);
    pq.add(50);
    pq.add(98);
    pq.add(44);
    pq.add(67);

    while (!pq.isEmpty()) {
      System.out.println(pq.poll());
    }

  }

}
