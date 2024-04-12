public class PatternPrint {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int j;
            if (i <= n) {
                j = i;
            } else {
                j = 2 * n - i;
            }
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

