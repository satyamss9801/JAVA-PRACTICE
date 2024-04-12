import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queuep {
    static void printN(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("5");
        q.add("6");
        for (int i = 0; i < n; i++) {
            String curr = q.poll();
            System.out.println(curr + " ");
            q.add(curr + "5");
            q.add(curr + "6");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Terms : ");
        int n = sc.nextInt();
        printN(n);

    }

}
