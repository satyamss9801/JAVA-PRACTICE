import java.util.ArrayList;

public class Solution {
    // Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> al = new ArrayList<>();
        int l = 0;
        int r = 0;
        int sum = 0;
        while (l < n) {
            r = l;

            while (r < n && sum < s) {
                sum = sum + arr[r];
                r++;

            }

            if (sum == s)
                break;
            l++;
            sum = 0;
        }
        if (sum == s & l <= r-1) {

            System.out.println(l + 1 + " : " + r);

            return al;
        }

        return null;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        // subarraySum(arr, arr.length, 15);
        if (subarraySum(arr, arr.length, 0) != null) {
            System.out.println("Substring Found ");
        } else {
            System.out.println("Substring Not Found");
        }

    }
}