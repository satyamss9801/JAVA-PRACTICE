public class rec1 {
    static int rec(int n) {
        if (n == 1)
            return n;
        return n * rec(n - 1);

    }

    public static void main(String[] args) {
        System.out.println(rec(6));
    }

}
