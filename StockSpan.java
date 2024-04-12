import java.util.ArrayDeque;
import java.util.Deque;

public class StockSpan {

    static void PrintSpan(int arr[]) {
        Deque<Integer> st = new ArrayDeque<Integer>();
        st.push(0);
        int span = 1;
        System.out.println(span + "  ");

        for (int i = 1; i < arr.length; i++) {
            while (st.isEmpty() == false && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            span = (st.isEmpty()) ? (i + 1) : (i - st.peek());
            System.out.println(span + "  ");
            st.push(i);
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 60, 10, 20, 40, 35, 30, 59, 70, 65 };
        PrintSpan(arr);
    }

}
