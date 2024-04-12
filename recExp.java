public class recExp {
    static int exp(int p) {
        if (p == 0)
            return 1;

        int ans = exp(p / 2);
        if ((p & 1) == 1) {
            return 2 * ans * ans;
        } else {
            return ans * ans;
        }
    }

    public static void main(String[] args) {
        System.out.println(exp(3));
    }
}
