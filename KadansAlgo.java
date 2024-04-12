import java.util.Scanner;

/* TO FIND SUM OF MAX SUB-ARRAY */
public class KadansAlgo {
    static int SumOfSubarray(int arr[]) {
        int maxsum = 0;
        int cursum = 0;

        for (int i = 0; i < arr.length; i++) {
            cursum = cursum + arr[i];

            if (cursum > maxsum) {
                maxsum = cursum;

            } else {
                cursum = 0;
            }

        }
        return maxsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY");
        int x = sc.nextInt();
        int arr[] = new int[x];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("ENTER VALUE : ");
            arr[i] = sc.nextInt();

        }
        System.out.println("MAX SUB ARRAY VALUE : " + SumOfSubarray(arr));
    }

}
