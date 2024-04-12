import java.util.Scanner;

/*TIME COMPLEXITY = O(n)
 * SPACE COMPLEXITY = O(1)
 */

public class BoyerMoore {
    static void getMajority(int a[]) {

        int ansIndex = 0;
        int count = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[ansIndex]) {
                count++;

            } else {
                count--;

            }

            if (count == 0) {
                ansIndex = i;
                count = 1;

            }
        }
        count = 1;
        for (int i = 0; i <= ansIndex; i++) {
            if (a[ansIndex] == a[i]) {
                count++;
            }
        }
        if (count > a.length / 2) {
            System.out.println("MAJORITY ELEMENT IS : " + a[ansIndex]);
        } else {
            System.out.println("no majority element Found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NUMBER OF ELEMENTS YOU WANT TO ENTER");
        int x = sc.nextInt();
        int a[] = new int[x];
        for (int i = 0; i < a.length; i++) {
            System.out.println("ENTER VALUES");
            a[i] = sc.nextInt();
        }

        getMajority(a);

    }
}
