public class kaddans {
    public static void main(String[] args) {
        int[] arr = { 4, 1, -2, 8, -7, 5, 6, 3, 2, -1 };
        maxSubArray(arr, arr.length);

    }

    static void maxSubArray(int[] arr, int n) {
        int maxsum = 0;
        int cursum = 0;

        for (int i = 0; i < n; i++) {
            cursum = cursum + arr[i];

            if (cursum > maxsum) {
                maxsum = cursum;
            }
            if (cursum < 0) {
                cursum = 0;
            }
        }
        System.out.println("Maxsum = " + cursum);

    }
}