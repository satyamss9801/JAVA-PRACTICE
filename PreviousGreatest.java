import java.util.ArrayDeque;
import java.util.Deque;

public class PreviousGreatest {
    /* NORMAL APROACH */

    static void PrintGre(int arr[]) {
        int prev = -1;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    prev = arr[j];
                    break;

                }
            }
            System.out.println(prev + "  ");
        }
    }

    /* BETTER APROACH */
    static void PrintGreByStack(int arr[]) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(arr[0]);
        int preG = -1;
        System.out.println(preG + "  ");

        for (int i = 1; i < arr.length; i++) {

            while (stack.isEmpty() == false && stack.peek() <= arr[i]) {
                stack.pop();
            }

            preG = (stack.isEmpty()) ? -1 : stack.peek();
            System.out.print(preG + " ");
            stack.push(arr[i]);

        }

    }

    static void PrintNextG(int arr[]) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = arr.length;
        stack.push(arr[n - 1]);
        int res[] = new int[n];

        res[n - 1] = -1;

        for (int i = n - 2; i > 0; i--) {
            while (stack.isEmpty() == false && stack.peek() < arr[i]) {
                stack.pop();
            }
            res[i] = (stack.isEmpty()) ? -1 : stack.peek();
            stack.push(arr[i]);

        }
        for (int j = 0; j < res.length; j++) {
            System.out.print(res[j] + "  ");
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 50, 45, 14, 12, 45, 14, 11, 15 };

        PrintNextG(arr);

    }

}
