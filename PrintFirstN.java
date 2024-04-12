import java.util.*;

public class PrintFirstN {
    static void printit(int n) {
        Queue<String> q = new LinkedList<String>();
        q.add("5");
        q.add("6");

        for (int count = 0; count < n; count++) {
            String cur = q.poll();
            System.out.println(cur + " ");
            q.add(cur + "5");
            q.add(cur + "6");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of string you want to print of 5 and 6");
        int n = sc.nextInt();
        printit(n);

    }

}
