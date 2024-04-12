import java.util.Arrays;

public class equals {
    public static void main(String[] args) {
        String a[] = { "GFG", "IDE" };
        String b[] = { "gfg", "ide" };

        if (Arrays.equals(a, b, String::compareToIgnoreCase)) {
            System.out.println("yes");
        } else {
            System.out.println("NO");
        }
    }
}
