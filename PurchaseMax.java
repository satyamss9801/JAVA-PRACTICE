import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/*TIME COMPLEXITY = O(n+ res*logn)
 * Space colexity = O(n)
 */

public class PurchaseMax {
    static int Maxitm(Collection<Integer> al, int money) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(al);
        int res = 0;
        while (pq.isEmpty() == false && money > 0 && pq.peek() < money) {
            money = money - pq.poll();
            res++;

        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> al = new ArrayList<Integer>();
        al.add(5);
        al.add(10);
        al.add(15);
        al.add(50);
        al.add(16);
        al.add(2);

        System.out.print("ENTER YOUR BUDGET VALUE TO PURCHASE ITEMS : ");
        int money = sc.nextInt();
        System.out.println("MAXIMUM NUMBER OF ITEM YOU ABLE TO PURCHASE  : " + Maxitm(al, sum));

    }

}
