import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class thiefproblem {
    /* TIME COMPLEXITY : O(nlogn) */
    static void userev(Integer item[], int k) {
        Arrays.sort(item, Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            System.out.print(item[i] + "  ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer item[] = { 80, 22, 54, 75, 25, 36, 45, 62 };
        System.out.println("ENTER NUMBER OF ITEM ALLOWED TO PIC BY THIEF");
        int k = sc.nextInt();
        userev(item, k);

    }

}
