import java.util.Scanner;

import javax.management.MBeanAttributeInfo;

public class EvenUserSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST VALUE");
        int x = sc.nextInt();
        System.out.println("ENTER LAST VALUE");
        int y = sc.nextInt();
        int sum = 0;
        int i = x;

        while (i <= y) {
            if ((i & 1) == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("EVEN SUM = " + sum);
    }

}
