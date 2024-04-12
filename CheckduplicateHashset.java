import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*TIME COMPLEXITY : O(n)
 * SPACE COMPLEXITY : O(1)
 */

public class CheckduplicateHashset {

    static void PrintUniqe(Integer arr[]) {

        HashSet<Integer> h = new HashSet<>(Arrays.asList(arr));
        for (Integer i : h) {
            System.out.print(i+" ");
        }


     
    }

    /*
     * TIME COMPLEXITY : O(n)
     * SPACE COMPLEXITY : O(n)
     */
    static void PrintRepeted(Integer arr[]) {

        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (h.contains(arr[i]) == true) {
                System.out.println(arr[i] + "  ");
            } else {
                h.add(arr[i]);
            }
        }
    }

    /* TIME COMPLEXITY : O(n) */

    static boolean CheckPairSum(Integer arr[], int sum) {

        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (h.contains(arr[i])) {
                return true;
            } else {
                h.add(arr[i]);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE SIZE OF ARRAY");
        int x = sc.nextInt();
        Integer[] arr = new Integer[x];

        for (int i = 0; i < x; i++) {
            System.out.println("ENTER VALUES");
            arr[i] = sc.nextInt();

        }
        PrintUniqe(arr);
    
        System.out.println("\nENTER VALUES TO CHECK PAIR FOUND OR NOT : ");
        x = sc.nextInt();
        if (CheckPairSum(arr, x) == true) {
            System.out.println("Pair Found");
        } else {
            System.out.println("Pair Not Found");
        }
    }

}
