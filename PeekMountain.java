import java.util.*;

public class PeekMountain {

    public static  List<Integer> findPeaks(int[] m) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = m.length;
        for (int i = 1; i < n - 1; i++) {
            if (m[i] > m[i + 1] && m[i] > m[i - 1]) {
                ans.add(i);
            }
        }
        if (m[0] > m[1]) {
            ans.add(0);
        }
        if (m[n - 1] > m[n - 2]) {

            ans.add(n - 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,1,3};
        System.out.println(findPeaks(arr));
    }
}
