import java.util.Scanner;

public class StudPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Marks Of " + (i + 1) + "  Student in Five Subjects:Total Marks 100");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int k = sc.nextInt();
            int l = sc.nextInt();

            int total = x + y + z + k + l;
            arr[i] = total;

        }
        System.out.println("STUDENTS Obtained Marks Greater than 30% ");
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 150) {
                System.out.println("ROll :" + i + "Total  Marks" + arr[i]);

            }
        }

    }

}
